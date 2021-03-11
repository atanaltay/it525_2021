package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RegisterBean {

	
	private String name;
	private String lastName;
	
	//Action Method
	public String registerPerson() {
		
		System.out.println("Name:" + name + " -- Last Name:" + lastName);
		
		return "registerresult.jsf";
	}
	
	
	public String getRegisterMessage() {
		if(name==null) {
			return "";
		}else {
			return "Your name is " + name + " and last name is " + lastName;
		}
		
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
