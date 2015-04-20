package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String name) {
		double result = 0;
		
		if (name.equals("1")) {
			result = 10.0;
		} else if (name.equals("2")) {
			result = 45.0;
		} else if (name.equals("3")) {
			result = 20.0;
		} else if (name.equals("4")) {
			result = 35.0;
		} else if (name.equals("5")) {
			result = 50.0;
		} else if (name.equals("dion")) {
			result = Double.MAX_VALUE;
		} else {
			result = 0.0;
		}
		
		return result;
	}
}
