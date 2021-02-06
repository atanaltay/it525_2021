package example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Student stu1 = new Student(2000, "altug");
		Student stu2 = new Student(1999, "ahmet");
		Student stu3 = new Student(2001, "mehmet");
		Student stu4 = new Student(2008, "hasan");
		Student stu5 = new Student(2010, "ali");
		Student stu6 = new Student(2012, "osman");
		
		List<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);
		
		
		//Anonymous implementation of Comparator
		Collections.sort(students, new Comparator<Student>() {		
			@Override
			public int compare(Student o1, Student o2) {
				return new Integer(o1.getBeginYear()).compareTo(o2.getBeginYear());
			}

		});
		
		
		System.out.println(students);
		System.out.println("------------------");
		//Anonymous implementation of Comparator
		Set<Student> stuSet = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
	
		stuSet.add(stu1);
		stuSet.add(stu2);
		stuSet.add(stu3);
		stuSet.add(stu4);
		stuSet.add(stu5);
		stuSet.add(stu6);
		
		System.out.println(stuSet);
		
	}
	
	
	
	
}
