package sgsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/scompln")
public class SaveComplainServelt  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ctgy=req.getParameter("category");
		String cmplnbx=req.getParameter("cmpln");
		String uid =req.getParameter("uid");
		
		try {
			Connection con=sgsystemcon.connect();
			 final String sql="insert into scmpl values (?,?,?)";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1, ctgy);
			 ps.setString(2, cmplnbx);
			 ps.setString(3, uid);
			 ps.executeUpdate();
			 resp.sendRedirect("StudentHP.jsp");
			 resp.getWriter().println("succes");
		}
		catch(Exception ex) {
			resp.getWriter().println("Error"+ex.getMessage());
		}
		
	}

}
