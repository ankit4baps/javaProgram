package com.pkg.nextgen;

import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// Program for first non repeated character
		
		Scanner sc = new Scanner(System.in);
		String str="";
		int count = 0;
		
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		
		//logic for checking each character with another char
		int i=0;
		for(; i < str.length() - 1; i++) {
			
			Character ch = str.charAt(i);
			if(!(str.substring(i+1).contains(ch.toString()) || str.substring(0,i).contains(ch.toString()) )) {
				System.out.println("First Non Repeated Character is: " + ch);
				break;
			}
			
			/*for(int j = i; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				}
				if(count == 1) {
					System.out.println("First Non Repeated Charcter is:" + str.charAt(i));
					break;
				}
				else
					count = 0;
			}*/
		}
		if(i == str.length() - 1) {
			System.out.println("No Non Repeated Character");
		}
	}

}
