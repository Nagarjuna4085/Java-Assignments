package assignment.programs;

import java.util.Scanner;

public class Speed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter distance in meters");
		double m = sc.nextDouble();
		System.out.println("Input Hour :");
		int h = sc.nextInt();
		System.out.println("Input minute :");
		int min = sc.nextInt();
		System.out.println("Input Seconds :");
		int sec = sc.nextInt();
		
		//s = d/t
	    double totalSeconds = h*60*60 + min*60 + sec;
	    
	    double currentHours = totalSeconds/3600;
//	    1 mile = 1609 meters
	    double miles = m/1609.0;
	    double kms = m /1000.0;
	    
	    
	    double speedInM_S = m/totalSeconds;
	    double speedInK_H = kms/currentHours;
	    double speedInM_H = miles/currentHours;
	    
        System.out.println("Your speed in meters/second is " + speedInM_S);
        System.out.println("Your speed in km/h is " + speedInK_H);
        System.out.println("Your speed in miles/h is " + speedInM_H);
		
	}

}
