package assignment.programs;

import java.util.Scanner;

public class SequenceOfNumber {
public static void main(String[] args) {
	System.out.println("Input six non-negative digits: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = Integer.toString(n);
	for (int i = 0; i < s.length(); i++) {
		System.out.print(s.charAt(i)+" ");
		
	}
	
	sc.close();
}
}
