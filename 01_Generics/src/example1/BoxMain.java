package example1;

public class BoxMain {

	
	public static void main(String[] args) {
		
		//Generic types onlu supprt Reference types
		//int -> Integer
		Box<Integer,Integer> intBox = new Box<>(23,45);
		
		Box<Student,Integer> stuBox = new Box<>(new Student(),45);
		
		
		stuBox.getInfo();
		intBox.getInfo();
		
	
		
	}
	
	
	
	
	
	
}
