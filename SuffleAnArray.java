package com.pkg.sort;

import java.util.Arrays;
import java.util.Random;

public class SuffleAnArray {

	// To suffle an Array
	// i/p : {0,1,2,3,4,5,6,7}
	// o/p : {5,7,2,0,3,1,4,6}
			
	public static void main(String[] args) {
		int input[] = {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(doSuffle(input)));
	}

	private static int[] doSuffle(int[] input) {
		// Use the random function to generate a random
		//integer value for suffling the array
		Random num = new Random();
		
		//use a for loop to suffle the array
		for(int i = 0; i < input.length; i++) {
			int random = num.nextInt(input.length - 1);
			if(i != random) {
				input = swap(i, random, input);
			}
		}
		return input;
	}

	private static int[] swap(int index1, int index2, int[] arr) {
		int swap = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = swap;
		
		return arr;
	}

}
