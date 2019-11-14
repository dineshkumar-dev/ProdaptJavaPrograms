package javaFirstProdapt;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double deposit=s.nextInt();
		double interest=s.nextFloat();
		int thresold =s.nextInt();
		int year;
		for(year=0;thresold>deposit;year++) {
			deposit=deposit+(deposit)*((double)interest/100);
		}
		System.out.println(year);
	}

}
