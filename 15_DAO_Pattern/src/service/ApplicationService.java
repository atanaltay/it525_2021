package service;

import java.util.List;

import dao.DepartmentDAO;
import model.Department;
import model.Employee;

public interface ApplicationService {

	
	public List<Department> getAllDepartments();
	public List<Employee> getEmployeesByDepartmentId(int departmentId);
	public void updateEmployee(Employee emp);
	
	
	
	
}
