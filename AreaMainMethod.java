package com.pkg.nextgen;

public class AreaMainMethod {

	public static void main(String[] args) {
		// create an object of area method
		Area ar = new Area();
		
		//call the area method for square
		System.out.println("Area of a Square: " + ar.area(10));
		
		//call the area methos for Circle
		System.out.println("Area of Circle: " + ar.area(5.0));

	}

}
