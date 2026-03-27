package assignment.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfN {

public static void main(String[] args) {
   
	System.out.println("Enter number between 0 and 1000");
	Scanner sc = new Scanner(System.in); 
	Integer number = sc.nextInt();
	if(number <0 || number>1000) {
		System.out.println("Invalid input");

	}else {
		String s = number.toString();
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int n = c-'0';
			sum+=n;
		}
		System.out.println("The sum of all digits in "+ number +"  is "+ sum);
		
	}


}
}
