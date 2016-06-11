package firstNextgen;

import java.util.Scanner;

public class SwitchProgramForMonth {

	public static void main(String[] args) {
		// Write a program to print the month with switch case
		//take the input from user with the help of Scanner
		
		System.out.println("Enter any number of Month:");
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		
		//Please store the month name in string to print
		String str = "abc";
		
		switch(mon) {
		case 1: System.out.println("Entered number by User:" + mon + " and Month is January");
			break;
		case 2: System.out.println("Entered number by User:" + mon + " and Month is February");
			break;
		case 3: System.out.println("Entered number by User:" + mon + " and Month is March");
			break;
		case 4: System.out.println("Entered number by User:" + mon + " and Month is April");
			break;
		case 5: System.out.println("Entered number by User:" + mon + " and Month is May");
			break;
		case 6: System.out.println("Entered number by User:" + mon + " and Month is June");
			break;
		case 7: System.out.println("Entered number by User:" + mon + " and Month is July");
			break;
		case 8: System.out.println("Entered number by User:" + mon + " and Month is August");
			break;
		case 9: System.out.println("Entered number by User:" + mon + " and Month is September");
			break;
		case 10: System.out.println("Entered number by User:" + mon + " and Month is October");
			break;
		case 11: System.out.println("Entered number by User:" + mon + " and Month is November");
			break;
		case 12: System.out.println("Entered number by User:" + mon + " and Month is December");
			break;
			
			default: System.out.println("Invalid Number");
		}
		
	}

}
