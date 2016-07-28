package com.pkg.sort;

public class HouseStolenMoney {

	public static void main(String[] args) {
		// You have n houses with certain amount of money stashed in each house. 
		//You can not steal any adjacent houses. 
		//Given a list of non-negative integers representing the amount of money of each house, 
		//determine the maximum amount of money you can steal.
		
		int input[] = {100, 200, -200, -100, 300};
		System.out.println(steal(input));
	}
	public static int steal(int[] num) {
		int even = 0;
		int odd = 0;
		int maxMoney = 0;
		
		for( int i = 0; i < num.length; i++) {
			if(i > 0) {
				if(i % 2 == 0) {
					even = even + num[i];
				}
				else {
					odd = odd + num[i];
				}
			}
			else {
				
			}
		}
		
		if(even > odd){
			maxMoney = even;
		}
		else {
			maxMoney = odd;
		}
		return maxMoney;
	}

}
