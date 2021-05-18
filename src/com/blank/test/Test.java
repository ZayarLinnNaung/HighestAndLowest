package com.blank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index = 0, number;
		List<Integer> intArr = new ArrayList<>();
		
		System.out.println("Enter a series of integers (2 successive negative or 2 successive positive to stop): ");
		while(true) {
			number = input.nextInt();
			
			if( index > 0) {
				if((intArr.get(index - 1) >= 0 && number >= 0) 
						|| (intArr.get(index - 1) < 0 && number < 0))
					break;
			}

			intArr.add(number);
			index++;
		}
		
		System.out.println("The highest integer : " + getHighest(intArr));
		System.out.println("The lowest integer : " + getLowest(intArr));
		
		input.close();
	}
	
	private static int getHighest(List<Integer> intArr) {
		int highestNum = Integer.MIN_VALUE;
		for(int number: intArr) {
			if(number > highestNum) {
				highestNum = number;
			}
		}
		
		return highestNum;
	}
	
	private static int getLowest(List<Integer> intArr) {
		int lowestNum = Integer.MAX_VALUE;
		for(int number: intArr) {
			if(number < lowestNum) {
				lowestNum = number;
			}
		}
		
		return lowestNum;
	}
}

