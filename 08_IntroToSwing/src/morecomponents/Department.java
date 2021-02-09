package morecomponents;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private int id;
	private String name;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static List<Department> getDepartments(){
		
		Department dept1 = new Department(1, "IT");
		Department dept2 = new Department(2, "SALES");
		Department dept3 = new Department(3, "ACCOUNTING");
		
		
		
		List<Department> depts = new ArrayList<Department>();
		depts.add(dept1);
		depts.add(dept2);
		depts.add(dept3);
		return depts;
		
	}
	
	

}
