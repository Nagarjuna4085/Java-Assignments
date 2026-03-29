package assignment.programs;

import java.util.Scanner;

public class FiniteFloating {
	public static void main(String[] args) {
		System.out.println("Enter floating point:");
		Scanner sc = new Scanner(System.in);
		Double num = sc.nextDouble();
		boolean b = Double.isFinite(num);
		if(b) {
			System.out.println(num + " is finnite floating point number");
		}else {
			System.out.println(num + " is not finnite floating point number");
			
		}
		
		sc.close();
	}

}
