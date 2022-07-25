package sgsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/svcmpln")
public class savecpln extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String ctgy=req.getParameter("ctgy");
		String cmplnbx=req.getParameter("cmplnbx");
		String uid=req.getParameter("uid");
		System.out.println(ctgy);
		System.out.println(cmplnbx);
		System.out.println(uid);
		try {
			Connection con=sgsystemcon.connect();
			 final String sql="insert into scmpl values ('0',?,?,?)";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1, ctgy);
			 ps.setString(2, cmplnbx);
			 ps.setString(3, uid);
			 ps.executeUpdate();
			 resp.sendRedirect("studentFirst.jsp");
			
		}
		catch(Exception ex){
			
			resp.getWriter().println("Error"+ex.getMessage());
		}
		
	}
}

