package model;

public class Department extends BaseEntity{
	

	private String name;


	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Department(int id, String name) {
		super(id);
		this.name = name;
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
		
	
}
