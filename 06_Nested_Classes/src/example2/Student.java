package example2;

public class Student {

	private int beginYear;
	private String name;
	
	public Student(int beginYear, String name) {
		super();
		this.beginYear = beginYear;
		this.name = name;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public int getBeginYear() {
		return beginYear;
	}


	public void setBeginYear(int beginYear) {
		this.beginYear = beginYear;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [beginYear=" + beginYear + ", name=" + name + "]";
	}
	
	
	
	
	
}
