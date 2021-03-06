package service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import dao.DepartmentDAO;
import dao.DepartmentDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Department;
import model.Employee;

@RequestScoped
public class ApplicationServiceImpl implements ApplicationService, Serializable{

	@Inject
	private DepartmentDAO departmentDao;
	
	@Inject
	private EmployeeDAO employeeDAO;
	
	
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

	@Override
	public int deleteDepartment(Department dept) {
		return departmentDao.delete(dept);
	}

	@Override
	public int saveDepartment(Department dept) {
		return departmentDao.insert(dept);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	public int saveEmployee(Employee emp) {
		return employeeDAO.insert(emp);
	}

	@Override
	public int deleteEmployee(Employee emp) {
		return employeeDAO.delete(emp);
	}

	
	
	
	
	
}
