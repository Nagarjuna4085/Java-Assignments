package assignment.programs;

import java.util.Scanner;

public class Exponenrianl {
	public static void main(String[] args) {
		System.out.println("enter number :");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		double square = Math.pow(number, 2);
		double cube = Math.pow(number, 3);
		double fourth = Math.pow(number, 4);
		System.out.printf("Sqaure: %.2f%n",square);
		System.out.printf("cube: %.2f%n",cube);
		System.out.printf("fourth: %.2f%n",fourth);
		sc.close();
	}

}
