package example_sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertExample {

	
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employeesdb", "root", "e118528!");

				
				) {
			
				
			String query = "insert into employee (name, lastname, salary, notes, department_id) values(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, "jack");
			psmt.setString(2, "johns");
			psmt.setDouble(3, 10000);
			psmt.setString(4, "Some notes about employee");
			psmt.setInt(5, 1);
			
			int numRows =  psmt.executeUpdate();
			
			if(numRows>0) {
				System.out.println("Insert successfull");
			}else{
				System.out.println("Insert not successfull");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
