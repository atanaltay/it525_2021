package model;

public abstract class BaseEntity {

	private int id;

	public BaseEntity(int id) {
		super();
		this.id = id;
	}
	
	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
