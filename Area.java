package com.pkg.nextgen;

public class Area {

	//example of method overloading
	
	//get an area of square
	public int area(int a) {
		return a*a;
	}
	
	//get an area of circle
	
	public double area(double r) {
		double pi = 3.14;
		return r*r*pi;
	}
}
