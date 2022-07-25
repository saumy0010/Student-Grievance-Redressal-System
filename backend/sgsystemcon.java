package sgsystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class sgsystemcon {
	public static Connection connect() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	final String url="jdbc:mysql://localhost/sgrsystem";
	Connection con=DriverManager.getConnection(url,"root","");
	System.out.println("conneect...");
	return con;
		

 }
	public static List<cmplns>getList(String uid)throws Exception{
		Connection con=connect();
		String sql="Select * from scmpl where uid=?";
		System.out.println(uid + "gaurav");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, uid);
		ResultSet rs=ps.executeQuery();
		ArrayList<cmplns> list=new ArrayList<>();
		while(rs.next()) {
			String tno=rs.getString("tno");
			String ctgy=rs.getString("ctgy");
			String cmplnbx=rs.getString("cmplnbx");
			cmplns cm=new cmplns(tno,ctgy,cmplnbx);
			list.add(cm);
		}
		con.close();
		return list;
	}
	
	public static List<Gcmpln>getList1(String ctgy1) throws Exception{
		Connection con=connect();
		String sql="Select * from scmpl where ctgy=?";
		System.out.println(ctgy1 + "gaurav");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, ctgy1);
		ResultSet rs=ps.executeQuery();
		List<Gcmpln> list1=new ArrayList<>();
		while(rs.next()) {
			String tno=rs.getString("tno");
			String ctgy2=rs.getString("ctgy");
			String cmplnbx=rs.getString("cmplnbx");
			String uid=rs.getString("uid");
			Gcmpln gm=new Gcmpln(tno,ctgy2,cmplnbx,uid);
			list1.add(gm);
		}
		con.close();
		return list1;
	}
	
}