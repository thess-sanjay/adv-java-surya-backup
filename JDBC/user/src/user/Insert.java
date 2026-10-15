package user;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			Statement s = c.createStatement();
			
			System.out.println("Successful!!!");
			
			s.executeUpdate("insert into cartoons values(3,'Shinchan', 'Hungama', 8, 4.5, 'tamil')");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
