package sgsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Addgrvnm")
public class addgriveance  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String ctgy=req.getParameter("ctgy");
		String uid=req.getParameter("userid");
		String pass=req.getParameter("pass");
		
		try {
			 Connection con=sgsystemcon.connect();
			 final String sql="insert into grvnm values (?,?,?,?,?)";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1, fname);
			 ps.setString(2, lname);
			 ps.setString(3, ctgy);
			 ps.setString(4, uid);
			 ps.setString(5, pass);
			 ps.executeUpdate();
			 resp.sendRedirect("LoginPage.jsp");
			 resp.getWriter().println("succes");
		}
		catch(Exception ex) {
			resp.getWriter().println("Error"+ex.getMessage());
		}
		
	}

}
