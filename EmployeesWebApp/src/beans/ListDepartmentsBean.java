package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Department;
import service.ApplicationService;

@Named
@RequestScoped
public class ListDepartmentsBean {

	
	@Inject private ApplicationService srv;
	
	private List<Department> departments;
	
	@PostConstruct
	public void init() {
		
		departments = srv.getAllDepartments();
	}
	
	public List<Department> getDepartments() {
		return departments;
	}
	
	
}
