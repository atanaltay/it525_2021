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
	
	@PostConstruct
	public void init(){
		
		//Somehow get department id...
		
	 int deptid= 
			 Integer.valueOf(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("deptid"));
		
		
		selectedDepartment = srv.getDepartmentById(deptid);
		employees = srv.getEmployeesByDepartmentId(deptid);
		
		
	}
	
	public Department getSelectedDepartment() {
		return selectedDepartment;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
}
