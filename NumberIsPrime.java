package com.pkg.nextgen;

import java.util.Scanner;

public class NumberIsPrime {

	public static void main(String[] args) {
		// Program for checking number is prime or not
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to check: ");
		int num = sc.nextInt();
		
		//logic for cheking the number is prime or not
		
		for(int i = 2; i < num/2; i++) {
			int temp = num % i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Entered number is Prime Number");
		}
		else {
			System.out.println("Entered number is not Prime Number");
		}
	}

}
