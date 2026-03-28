package assignment.programs;

import java.util.Scanner;

public class timetoGMT {
public static void main(String[] args) {
	
	System.out.println("Input the time zone offset to GMT :   ");
	Scanner sc = new Scanner(System.in);
	long offset = sc.nextLong();
	
	long currentMilliseconds = System.currentTimeMillis();
	long totalMills = currentMilliseconds + (offset * 60 * 1000);
	
	
	long totalseconds = totalMills/1000;  //
	long currentSeconds =  totalseconds%60; //SS
	long totalMinutes = totalseconds/60;
	long currentMinutes =totalMinutes%60; //MM
	long totalHours = totalMinutes / 60;
	long currentHour = totalHours % 24;
	
	System.out.println("Current time is  " +currentHour +":"  + currentMinutes + ":" + currentSeconds );
	sc.close();

}

}
