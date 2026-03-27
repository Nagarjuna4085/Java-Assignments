package assignment.programs;

import java.util.Scanner;

public class ToMeter {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many meetrs __________________'");
		// formula
		double $1_inch = 0.0254;
		double inches = input.nextDouble();
		
		double total_inches = inches * $1_inch; 
		System.out.println("total inches  =     "+ total_inches);
		
		input.close();
		         
		
	}
}
