package service;

import java.util.List;

import dao.DepartmentDAO;
import model.Department;
import model.Employee;

public interface ApplicationService {

	
	public List<Department> getAllDepartments();
	public Department getDepartmentById(int deptid);
	public int deleteDepartment(Department dept);
	public int saveDepartment(Department dept);
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public List<Employee> getEmployeesByDepartmentId(int departmentId);
	public void updateEmployee(Employee emp);
	public int saveEmployee(Employee emp);
	public int deleteEmployee(Employee emp);
	
	
	
	
	
	
}
