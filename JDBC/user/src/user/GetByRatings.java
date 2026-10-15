package user;

import java.sql.*;
import java.util.Scanner;

public class GetByRatings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Starting value: ");
		Double st = scan.nextDouble();
		 
		System.out.print("Enter Ending value: ");
		Double end = scan.nextDouble();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("select * from cartoons where ratings between ? and ?");
			
			ps.setDouble(1, st);
			ps.setDouble(2, end);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDouble(4));
				System.out.println(rs.getDouble("ratings"));
				System.out.println(rs.getString("language"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
