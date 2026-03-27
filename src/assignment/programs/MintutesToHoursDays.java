package assignment.programs;

import java.util.Scanner;

public class MintutesToHoursDays {

	public static void main(String[] args) {
		System.out.println("Enter minutes");
		Scanner sc = new Scanner(System.in);

		if (!sc.hasNextLong()) {
			System.out.println("Enter minutes in number");
		} else {
			long min = sc.nextLong();
			if(min <0) {
				System.out.println("please enter minuted in +ve");
			}
//			here i am thinking float is implicitly converting to long
			long days = min / (24 * 60);
			long years = days / 365;
			long remainingDays = days % 365;
			System.out.println(days);
			System.out.println(years);
			System.out.println(min + " minutes is approximately "+years+" years and "+remainingDays+" days\r\n"
					+ "");
			

		}
		sc.close();

	}

}
