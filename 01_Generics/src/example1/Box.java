package example1;

//A generic class
//By convention, the first generic variable's type must be T
// second E
public class Box<T,E> {

	private T variable;
	private E eVariable;

	
	public Box(T variable, E eVariable) {
		this.variable = variable;
		this.eVariable = eVariable;
	}
	
	public void getInfo() {
		System.out.println(variable.getClass().getSimpleName());
		System.out.println(eVariable.getClass().getSimpleName());
	}
	
	public E geteVariable() {
		return eVariable;
	}
	
	
	
	public T getVariable() {
		return variable;
	}
	
	public void setVariable(T variable) {
		this.variable = variable;
	}
}
