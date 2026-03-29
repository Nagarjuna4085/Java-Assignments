package assignment.programs;

import java.util.Scanner;

public class FloorMath {
	public static void main(String[] args) {
		System.out.println("Enter dividend :   ");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		System.out.println("Enter divisor :   ");
		int divisor = sc.nextInt();
		int floorDivison = Math.floorDiv(dividend, divisor);
		int floorModulus = Math.floorMod(dividend, divisor);
		System.out.println("floor divison  " + floorDivison);
		System.out.println("floor modulus " + floorModulus);

		
		

	}
}
