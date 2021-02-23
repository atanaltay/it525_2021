package service;

import java.util.List;

import dao.DepartmentDAO;
import dao.DepartmentDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Department;
import model.Employee;

public class ApplicationServiceImpl implements ApplicationService{

	private DepartmentDAO departmentDao = new DepartmentDAOImpl();
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	
	@Override
	public List<Department> getAllDepartments() {
		return departmentDao.findAll();
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(int departmentId) {
		
			return employeeDAO.findByDepartmentId(departmentId);
		
		
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		
		employeeDAO.update(emp);
		
	}

	
	
	
	
	
}
