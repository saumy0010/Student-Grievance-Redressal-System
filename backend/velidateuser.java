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
@WebServlet("/SVerifyuser")
public class velidateuser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid=req.getParameter("userid");
		HttpSession session=req.getSession();
		try {
			Connection con=sgsystemcon.connect();
			final String sql="select * from suser where uid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, uid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				resp.getWriter().println("no");
				
			}
			else {
				resp.getWriter().println("yes");
			}
		}
		catch(Exception ex) {
			resp.getWriter().println("Error "+ex.getMessage());
		}
		
	}
	
}


