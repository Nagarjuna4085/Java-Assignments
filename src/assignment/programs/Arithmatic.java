package assignment.programs;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) {
		System.out.println("Enter number 1");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		System.out.println("Enter number 2");

		double num2 = sc.nextInt();
		
//		Input 1st integer: 25
//		Input 2nd integer: 5
//		Expected Output :
//		Sum of two integers: 30
		int sum = (int) (num1+num2);
		System.out.println("Sum of two integers "+sum);
//		Difference of two integers: 20
		System.out.println("Difference of two integers "+ (int)(num1-num2));

//		Product of two integers: 125
		System.out.println("Product of two integers "+(int)(num1*num2));

//		Average of two integers: 15.00
		double avg = sum/2.0;
		System.out.println("Average of two integers "+ avg);
;
//		Distance of two integers: 20
		System.out.println("Distance of two integers "+(int)Math.abs(num1-num2));

//		Max integer: 25
	   System.out.println("Max of two integers "+(int)Math.max(num1, num2));

//		Min integer: 5
		System.out.println("MIn of two integers "+(int)Math.min(num1, num2));

		sc.close();
		
	}

}
