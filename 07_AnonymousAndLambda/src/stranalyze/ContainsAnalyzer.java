package stranalyze;

public class ContainsAnalyzer implements StringAnalyzer{

	@Override
	public boolean analyze(String target, String searchStr) {
		
		return target.toLowerCase().contains(searchStr.toLowerCase());
	}

}
