package example1;

import java.util.ArrayList;
import java.util.List;

public class Book {

	//Nested class: class in class
	//Three types:
	//1- Member inner class (static and non-static)
	//2- Local inner classes (class in a method)
	//3- Anonymous Inner Classes (class in a method, a more advanced version is lambda expressions)
	private static int GENERATOR;
	private String title;
	private int year;
	private Author author;
	
	private Page introPage;
	
	private List<Page> pages = new ArrayList<Page>();
	
	
	private Chapter introChapter;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int year, Chapter introChapter) {
		this.introChapter = introChapter;
		this.year = year;
		this.title = title;
	}
	
	public void addPage(Page page) {
		this.pages.add(page);
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setIntroPage() {
		
		
		
		class ColorPage implements Page{
			//They can only access the final local fields inside the method they are defined.
			private String color;
			
			public ColorPage(String color) {
				this.color = color;
			}
			
			
			@Override
			public void getContent() {
				System.out.println("Intro page, color:" + color );
				
			}
			
		}
		
		
		ColorPage iPage = new ColorPage("Gray");
		this.introPage = iPage;
		
		
		
		
		
		
	}
	
	
	
	
	public void getInfo() {
		System.out.println("Book:");
		System.out.println(title);
		
		System.out.println(introChapter.chapterTitle);
		introPage.getContent();
		
		for (Page page : pages) {
			page.getContent();
		}
		
		author.getInfo();
		
	}
	
	public Chapter getIntroChapter() {
		return introChapter;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	//Member class/inner class /nested class
	//Non static
	public class Chapter{
		private int no;
		private String chapterTitle;
		
		public Chapter() {
			
		}

		public Chapter(int no, String chapterTitle) {
			super();
			this.no = no;
			this.chapterTitle = chapterTitle;
		}
		
		public int getNo() {
			return no;
		}
		
		public String getChapterTitle() {
			return chapterTitle;
		}
		
		
		
	}
	
	//A static member class can only access the enclosing class's 
	//static members and methods
	static class AStaticType{
		
		private String name;
		
		public void test() {
			System.out.println(GENERATOR);
		}
		
		
		
	}
	
}


