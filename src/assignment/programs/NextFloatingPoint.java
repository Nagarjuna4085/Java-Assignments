package assignment.programs;

import java.util.Scanner;

public class NextFloatingPoint {
  public static void main(String[] args) {
	System.out.println("please enter the floating number");
	Scanner sc = new Scanner(System.in);
	double num = sc.nextDouble();
	double nextFloatPositive = Math.nextAfter(num, Double.POSITIVE_INFINITY);
	double nextFloatnegative = Math.nextAfter(num, Double.NEGATIVE_INFINITY);
	
	System.out.println("next floating positive :  "+ nextFloatPositive);
	System.out.println("next floating negative :  "+ nextFloatnegative);
	
	sc.close();
}

}
