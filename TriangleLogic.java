package com.pkg.nextgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleLogic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Write a program which tell a user 
		// if given sides of the triangle 
		//1. Equilateral triangle
		//2. Scalene Triangle
		//3. Isosceles Triangle
		//4. NOt triangle
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int side1 = Integer.parseInt(br.readLine());
		 int side2 = Integer.parseInt(br.readLine());
		 int side3 = Integer.parseInt(br.readLine());
		 
		 System.out.println("Three sides entered are: " + side1 + "," + side2 + "," +side3);
		 
		 if((side1 + side2) > side3 || (side2 + side3) > side1 || (side1 + side3) > side2) {
			 //For equivalent triangle
			 if(side1 == side2 && side2 == side3 && side3 == side1)
			 {
				 System.out.println(" Equilateral Triangle");
			 }
			//For Isosceles Triangle
			 else if(side1 == side2 || side2 == side3 || side3 == side1) {
				 System.out.println("Isosceles Triangle");
			 }
			//For Scalene Triangle
			 else {
				 System.out.println("Scalene Triangle");
			 }
		 }
		 else {
			 System.out.println(" Not a Triangle");
		 }
	}

}
