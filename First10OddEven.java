package com.pkg.nextgen;

public class First10OddEven {

	public static void main(String[] args) {
		// Program for printing 10 odd and even
		
		int n = 20;
		
		System.out.print("First 10 ODD numbers are: ");
		for(int i = 1; i <= n; i++) {
			//for checking number is odd
			if( i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.print("\nFirst 10 EVEN numbers are: ");
		for(int i = 1; i <= n; i++) {
			//for checking number is Even
			if( i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
	}

}
