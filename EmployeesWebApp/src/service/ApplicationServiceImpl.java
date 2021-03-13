package service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import dao.DepartmentDAO;
import dao.DepartmentDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Department;
import model.Employee;

@SessionScoped
public class ApplicationServiceImpl implements ApplicationService, Serializable{

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

	@Override
	public Department getDepartmentById(int deptid) {
		return departmentDao.findById(deptid);
	}

	
	
	
	
	
}
