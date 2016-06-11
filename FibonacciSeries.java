package com.pkg.nextgen;

public class FibonacciSeries {

	public static void main(String[] args) {
		// This program is for Fibonacci Series
		// variable initialization
		int n1=0, n2=1, n3;
		
		System.out.println("Fibonacci Series from Numbers 1 to 10");
		
		//printing  0 and 1
		System.out.print(n1 + " " + n2);
		
		//loop is start from 2 bcz 0 and 1 is printed
		for(int i = 2; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
