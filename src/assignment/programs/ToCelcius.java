package assignment.programs;

public class ToCelcius {
	
	public static double fahrenheitToCelcius(int temp) {
		double result = 0.0;
		
		// formaul
//		c= (F-32)*5/9
		
		result = (temp-32)*(5.0/9.0);
		
		return result;
	}
	
	public static void main(String[] args) {
		double temp1 = fahrenheitToCelcius(100);
		System.out.println(temp1);
		System.out.println()
		
	}

}
