package JavaPractice.JavaSelenium;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JavaSQLConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false","root","Kolkata@1");
			java.sql.Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("Select * from world.city");
			
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
