package beans;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import model.Department;
import model.Employee;
import service.ApplicationService;

@Named
@RequestScoped
public class EmployeesByDepartment {

	
	private List<Employee> employees;
	
	@Inject ApplicationService srv;
	
	private Department selectedDepartment;
	
	private Employee newEmployee;
	
	@PostConstruct
	public void init(){
		
		//Somehow get department id...
		
	 int deptid= 
			 Integer.valueOf(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("deptid"));
		
		newEmployee = new Employee();
		selectedDepartment = srv.getDepartmentById(deptid);
		employees = srv.getEmployeesByDepartmentId(deptid);
		
		
	}
	
	public String saveEmployee() {
		newEmployee.setDepartment_id(selectedDepartment.getId());
		srv.saveEmployee(newEmployee);
		employees = srv.getEmployeesByDepartmentId(selectedDepartment.getId());
		//return "employeesbydepartment?faces-redirect=true&deptid=" + selectedDepartment.getId() ;
		return null;
	}
	
	public String deleteEmployee(int empid) {
		Employee empToDelete = new Employee();
		empToDelete.setId(empid);
		srv.deleteEmployee(empToDelete);
		employees = srv.getEmployeesByDepartmentId(selectedDepartment.getId());
		return null;
	}
	
	
	public Department getSelectedDepartment() {
		return selectedDepartment;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Employee getNewEmployee() {
		return newEmployee;
	}
	
	public void setNewEmployee(Employee newEmployee) {
		this.newEmployee = newEmployee;
	}
}
