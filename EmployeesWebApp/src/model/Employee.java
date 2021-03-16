package model;

public class Employee extends BaseEntity{

	private String name;
	private String lastname;
	private double salary;
	private String notes;
	private int department_id;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String lastname, double salary, String notes, int department_id) {
		super(id);
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
		this.notes = notes;
		this.department_id = department_id;
	}


	public String txtnotes() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public int getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	@Override
	public String toString() {
		return name + " " + lastname;
	}
	
	

	
}
