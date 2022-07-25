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

@WebServlet("/Gchngpss")
public class griveancechngpssservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pss=req.getParameter("pss");
		String npss=req.getParameter("npss");
		HttpSession session=req.getSession();
		String uid= session.getAttribute("uid").toString();
		System.out.println(uid);
	try {
		Connection con=sgsystemcon.connect();
		final String sql="SELECT * from grvnm where uid=? and pss=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, uid);
		ps.setString(2, pss);
		ResultSet  rs=ps.executeQuery();
		if(rs.next()) {
			ps=con.prepareStatement("update grvnm set pss=? where uid=?" );
			ps.setString(2, uid);
			ps.setString(1, npss);
			ps.executeUpdate();
			session.setAttribute("msg","Password changed");
			resp.sendRedirect("Griveancehome.jsp");
		}
		else {
			session.setAttribute("msg","current password not matched....!!!");
			resp.sendRedirect("Griveancechngpss.jsp");
		}
	}
	catch(Exception  ex){
		session.setAttribute("msg","current password not matched....!!!");
		System.out.println("msg"+ex.getMessage());
		
		
	}
	
	}

}
