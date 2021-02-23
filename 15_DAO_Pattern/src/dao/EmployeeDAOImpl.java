package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Employee item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Employee item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findByDepartmentId(int departmentId) {
		List<Employee> employees = new ArrayList<>();
		try (
				Connection conn = ConnectionManager.getConnection();
				
				)
		
		{
			
			String query = "select * from employee where department_id=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, departmentId);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				employees.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("lastname"), rs.getDouble("salary"),
						rs.getString("notes"), rs.getInt("department_id")));
				
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return employees;
	}

	
	
	
	
	
	
}
