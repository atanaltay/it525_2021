package example1;

import example1.Book.AStaticType;
import example1.Book.Chapter;

public class MainClass {

	public static void main(String[] args) {
		
		Chapter intoChapter = new Book(). new Chapter(1,"intro");
		
		
		Book book = new Book("Grapes of Wrath", 1880, intoChapter);
		book.setIntroPage();
		
		//A classic interface implementation
		FirstPage fp = new FirstPage();
		book.addPage(fp);
		
		//Anonymous inner class
		//Anonymous because it doenst' have a class name;
		book.addPage(new Page() {

			String color = "blue";
			
			@Override
			public void getContent() {
				System.out.println("Color is " + color);
				System.out.println("Secon page");
				
			}

		});
		
		
		book.addPage(new Page() {
			
			@Override
			public void getContent() {
				
				System.out.println("Second page...");
				
			}
		});
		
		book.setAuthor(new Author() {
			
			@Override
			public void getInfo() {
				System.out.println("Primary author: Some author");
			}
			
		});
		
		
		
		book.getInfo();
		
		//AStaticType tp1 = new Book.AStaticType();
		
		
	}
	
	
	
}
