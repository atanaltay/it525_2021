package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Department;

public class DepartmentDAOImpl implements DepartmentDAO{

	@Override
	public Department findById(int id) {
		Department department = null;
		
		try (
				Connection conn = ConnectionManager.getConnection();
				
				)
		{
		
			
			String query = "select * from department where id=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			rs.next();
			
			department = new Department(rs.getInt("id"), rs.getString("name"));
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return department;
	}

	@Override
	public List<Department> findAll() {
		List<Department> departments = new ArrayList<>();
		
		try (
				Connection conn = ConnectionManager.getConnection();
				
				)
		{
		
			
			String query = "select * from department";
			PreparedStatement psmt = conn.prepareStatement(query);
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				departments.add(new Department(rs.getInt("id"), rs.getString("name")));
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return departments;
	}

	@Override
	public int update(Department item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Department item) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
