package com.pkg.nextgen;
import java.util.Date;

public class PrintSystemDate {

	public static void main(String[] args) {
		// This program prints the system date
		
		//initiate a date object
		Date date = new Date();
		
		//Display Date using toString() method
		System.out.println("System date is :" + date.toString());
	}

}
