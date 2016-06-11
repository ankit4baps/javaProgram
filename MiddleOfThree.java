package com.pkg.nextgen;
import java.util.Arrays;
import java.util.Scanner;

public class MiddleOfThree {

	public static void main(String[] args) {
		// Program for find middle of three numbers
		int a[] = new int[3];
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		//Enter the numbers
		System.out.println("Enter Three numbers: ");
		/*n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		*/
		//Store the numbers in array
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		
		// sorting an array
		Arrays.sort(a);
		
		//print the middle of number
		System.out.println("Middle number between three numbers is: " + a[1]);
		
		//Print the sorted array
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
