package user;

import java.util.Scanner;
import java.sql.*;
import java.sql.*;

public class DynamicInsert{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Enter Name");
		String name = scan.nextLine();
		
		System.out.println("Enter Language");
		String language = scan.next();
		
		System.out.println("Enter Rating");
		Double rating = scan.nextDouble();
		
		scan.nextLine();
		System.out.println("Enter Director");
		String director = scan.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("insert into movies values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, language);
			ps.setDouble(4, rating);
			ps.setString(5, director);
			
			ps.executeUpdate();
			
			System.out.println("Data Inserted Successfully!!!");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
