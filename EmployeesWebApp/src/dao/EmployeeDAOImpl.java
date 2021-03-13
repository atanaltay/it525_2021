package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import model.Employee;

@SessionScoped
public class EmployeeDAOImpl implements EmployeeDAO, Serializable{

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
		int retVal = 0;

		try (
				Connection conn = ConnectionManager.getConnection();
				
				)
		
		{
			
			String query = "update employee set name=?,  lastname=?, salary=? where id=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, item.getName());
			psmt.setString(2, item.getLastname());
			psmt.setDouble(3, item.getSalary());
			psmt.setInt(4, item.getId());
			
			
			retVal = psmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retVal;
		
		
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
