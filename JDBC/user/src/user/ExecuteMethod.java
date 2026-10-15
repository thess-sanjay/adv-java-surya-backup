package user;
import java.sql.*;
import java.util.Scanner;

public class ExecuteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			Statement s = c.createStatement();
			
			boolean b = s.execute("Select * from cartoons");
			
			if(b) {
				ResultSet rs = s.getResultSet();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getDouble(4));
					System.out.println(rs.getDouble(5));
					System.out.println(rs.getString(6));
					System.out.println("-----------------");
				}
			}else {
				System.out.print("It is not a select type of query");
			}
			
			
			System.out.println("Data Inserted");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
