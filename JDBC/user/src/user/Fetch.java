package user;

import java.sql.*;
import java.util.Scanner;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ID: ");
		int id = scan.nextInt();
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
				
				PreparedStatement ps = c.prepareStatement("SELECT name,language from cartoons where id = ?");
				ps.setInt(1, id);
				
				ResultSet rs = ps.executeQuery();
			
				rs.next();
				System.out.println("Name = " + rs.getString(1));
				System.out.println("Language = " + rs.getString(2));
				
			} catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}

}
