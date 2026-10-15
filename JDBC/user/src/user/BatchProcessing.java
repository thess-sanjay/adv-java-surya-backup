package user;
import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter count: ");
		int count = scan.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("insert into cartoons values(?,?,?,?,?,?)");
			
			for(int i=1; i<=count; i++) {
				System.out.print("Enter Id");
				int id = scan.nextInt();
				
				System.out.print("Enter Name");
				String name = scan.next();
				
				System.out.print("Enter Channel");
				String channel = scan.next();
				
				System.out.print("Enter Rating");
				Double ratings = scan.nextDouble();
				
				System.out.print("Enter Timing");
				Double timing = scan.nextDouble();
				
				System.out.print("Enter Language");
				String language = scan.next();
				
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, channel);
				ps.setDouble(5, ratings);
				ps.setString(6, language);
				ps.setDouble(4, timing);
				
				ps.addBatch();
			}
			
			ps.executeBatch();
			
			System.out.println("Data Inserted");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
