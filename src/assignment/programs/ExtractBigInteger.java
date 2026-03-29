package assignment.programs;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtractBigInteger {
	public static void main(String[] args) {
		System.out.println("please enter big interger");
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		BigInteger bigNum = new BigInteger(val);
			
		long longVal = bigNum.longValue();
		
		int intVal = bigNum.intValue();
		
		float floatVal = bigNum.floatValue();
		
		double doubleVal = bigNum.doubleValue();
		
		
		
		
		System.out.println("long val :  "+longVal);
		System.out.println("int val :  "+ intVal);
		System.out.println("float val :  "+floatVal);
		System.out.println("double val :  "+doubleVal);
		
		sc.close();
	}

}
