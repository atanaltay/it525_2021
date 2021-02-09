package mathexample;

public class MathClass {

	public void makeCalculations(double[] x, double[] y, ICalculator calc) {
		
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(calc.calculate(x[i], y[i]));
		}
		
		
		
	}
	
	
	
	
}
