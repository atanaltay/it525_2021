package dao;

import java.util.List;

import model.Department;

public interface DepartmentDAO extends BaseDAO<Department>{

	
	@Override
	public Department findById(int id);
	@Override
	public List<Department> findAll();
	
	@Override
	public int update(Department item);
	
	public int insert(Department item);
	
	
}
