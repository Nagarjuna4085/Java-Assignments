package assignment.programs;

import java.util.Scanner;

public class CompareSignedUnsigned {
	
	public static void main(String[] args) {
		System.out.println("Enter number 1");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		
		int num2 = sc.nextInt();
		
        int signedComare = Integer.compare(num1, num2);
        
        int unsignedComare = Integer.compareUnsigned(num1, num2);
        System.out.println("------------------------------");
        System.out.println("Signed comparison: " + signedComare);
        System.out.println("Unsigned comparison: " + unsignedComare);
        sc.close();        				
	}

}
