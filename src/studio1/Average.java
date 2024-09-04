package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert first integer:");
		double n1 = in.nextInt();
		System.out.println ("Insert second integer:");
		double n2 = in.nextInt();
		double theAverage = (n1 + n2) / 2;
		System.out.println ("The average of your values is " + theAverage + ".");
	}

}
