package sgsystem;
import java.sql.*;
public class sgsystemcon {
	public static Connection connect() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	final String url="jdbc:mysql://localhost/sgrsystem";
	Connection con=DriverManager.getConnection(url,"root","");
	return con;
		

 }
}