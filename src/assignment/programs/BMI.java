package assignment.programs;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

		System.out.println("Please enter weight in pounds");
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		System.out.println("Please enter height in inches");
		double h = sc.nextDouble();
		System.out.println(w + " " + h);

		double bmi = (w / Math.pow(h, 2)) * 703;
		System.out.println("Calculated BMI is " + bmi);

		sc.close();

	}

}
