package service;

import java.util.List;

import dao.DepartmentDAO;
import model.Department;

public class ApplicationService {

	
	public List<Department> getAllDepartments(){
		
		return new DepartmentDAO().findAll();
		
		
		
	}
 	
	
	
	
	
}
