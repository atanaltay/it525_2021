package stranalyze;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		String[] data = new String[] {
				"Java rules",
				"I love Java",
				"I hate Java",
				"Python is easier than Java",
				"another String",
				"a string and more string and more string"
		};
		
		//Using a standard class implementation
		//ContainsAnalyzer ctsAnalyzer = new ContainsAnalyzer();
		
		//AnalyzerTool.searchData(data, "java", ctsAnalyzer);
		
		
		//Using an anonymous inner class
		
		AnalyzerTool.searchData(data, "java", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				return target.toLowerCase().contains(searchStr.toLowerCase());
			}
		});
		
		System.out.println("-----------------");
		AnalyzerTool.searchData(data, "ing", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				return target.toLowerCase().endsWith(searchStr.toLowerCase());
			}
		});
		
		
		System.out.println("------------");

		AnalyzerTool.searchData(data, "I", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				return target.toLowerCase().startsWith(searchStr.toLowerCase());
			}
		});
		
		System.out.println("-----------------");
		System.out.println("-----------------");
		
		//The code below is same with an anonymous inner class
		//This style is called Lambda Notation
		AnalyzerTool.searchData(data, "java", (target,search)-> target.toLowerCase().contains(search.toLowerCase()));
		System.out.println("------------");
		AnalyzerTool.searchData(data, "ing", (s1,s2)-> s1.toLowerCase().endsWith(s2.toLowerCase()));
		
		AnalyzerTool.searchData(data, "I", (t,sr)->{
			
			if(t.toLowerCase().startsWith(sr.toLowerCase())){
				return true;
			}else return false;
			
		});
		
		
	}
	
	
	
	
}
