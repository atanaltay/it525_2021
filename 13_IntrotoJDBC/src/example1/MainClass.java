package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	/*
	 * 1- Open Connection
		2- Create query (DDL/DML)
		3- Run the query -> Results
		4- Parse Results
		5- Close Connection
	 */
	
	//JDBC is under java.sql package
	
	public static void main(String[] args) {
		//First parameter is the connection string
		try(
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "e118528!");

				)
		{
			
			
			//To run a select query we need Statement object
			String query = "select * from country";
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				System.out.println(code + " - " + name);
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
