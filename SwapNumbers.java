package com.pkg.nextgen;
import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// Program for swapping two numbers without using third variable
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		x = sc.nextInt();
		
		System.out.println("Enter second Number");
		y = sc.nextInt();
		
		System.out.println("Befor Swapping two number: X = " + x + " and Y = " + y );
		//formula for swapping two numbers
		x = x + y;
		y = x - y;
		x = x - y;
		
		//numbers are swapped
		System.out.println("Number after Swapping : X = " + x + " and Y = " + y);
	}

}
