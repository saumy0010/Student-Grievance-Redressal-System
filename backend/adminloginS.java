package sgsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Adminlog")
public class adminloginS extends HttpServlet  {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid=req.getParameter("userid");
		String pss=req.getParameter("pass");
		System.out.println(uid);
		HttpSession session=req.getSession();
		try {
			Connection con=sgsystemcon.connect();
			final String sql="select * from admin where uid=? and pss=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, uid);
			ps.setString(2,pss);
			ResultSet rs=ps.executeQuery();
			System.out.println(pss);
			if(rs.next()) {
				session.setAttribute("uid",rs.getString("uid"));
				session.setAttribute("fname",rs.getString("fname"));
				session.setAttribute("lname",rs.getString("lname"));
				ps.executeUpdate();
				con.close();
				resp.getWriter().println("success");
			}
				
			else {
				session.setAttribute("msg","invalid password");
				resp.sendRedirect(" ");
			}
				
		}
		catch(Exception ex) {
			resp.getWriter().println("Error "+ex.getMessage());
		}
		
	}
}
