package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TemperatureConverter {

	private double value;
	private String resultText;
	
	public double convert(double value, String type) {
		
		if(type.equals("f")) {
			//fah to cell
			return (value-32)*(5.0/9.0);
		}else {
			//cel to fah
			return value*(9.0/5.0) + 32;
		}
		

		
	}
	
	public String doConvert(String type) {
		
		double result = convert(value, type);
		
		if(type.equals("f")) {
			resultText = value + " degrees to celcius is "  + result;
		}else {
			resultText = value + " degrees to fehrenheit is "  + result;
		}
		return null;
	}
	
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getResultText() {
		return resultText;
	}
	
}
