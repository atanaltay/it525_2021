package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import model.Department;

@RequestScoped
public class DepartmentDAOImpl implements DepartmentDAO, Serializable{

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
		String query = "insert into department(name) " + "values(?);";
		int retval =0;
		try (Connection conn = ConnectionManager.getConnection(); 
			PreparedStatement psmt = conn.prepareStatement(query);

		) {

			psmt.setString(1, item.getName()
					);

			retval = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}

	@Override
	public int delete(Department item) {
		String query = "delete from department where id=?";
		int retval = 0;
		
		try (
				Connection conn =ConnectionManager.getConnection();
				PreparedStatement psmt = conn.prepareStatement(query);
				
				
				){
			
			
			psmt.setInt(1, item.getId());

			retval = psmt.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}

	
	
	
	
}
