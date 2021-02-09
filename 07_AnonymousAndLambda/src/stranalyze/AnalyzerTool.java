package stranalyze;

public class AnalyzerTool {

	
	public static void searchData(String[] targets,String searchStr,StringAnalyzer analyzer) {
		
		
		for (String target : targets) {
			
			if(analyzer.analyze(target, searchStr)) {
				System.out.println("Match:" + target);
			}
			
			
		}
		
		
	}
	
	
	
}
