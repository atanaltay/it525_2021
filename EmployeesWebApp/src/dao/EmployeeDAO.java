package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO extends BaseDAO<Employee>{
	
	
	public List<Employee> findByDepartmentId(int departmentId);
	

}
