package com.prowings.assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment2 {
	
	public static void printStrongNess(String input) {
		
		int n = input.length();
		
		boolean hasLower = false,
				hasUpper = false,
				hasDigit = false,
				specialChar = false;
		
		Set<Character> set = new HashSet<Character>(Arrays.asList('!','@','#','$','%','^','&','*','(', ')','-','+'));
		
		for(char i : input.toCharArray())
		{
			if(Character.isLowerCase(i))
				hasLower = true;
			if(Character.isUpperCase(i))
				hasUpper = true;
			if(Character.isDigit(i))
				hasDigit = true;
			if(set.contains(i))
				specialChar = true;	
		}
		System.out.println("Strength of password :- ");
		
		if(hasDigit && hasLower && hasUpper && specialChar && (n>=6))
			System.out.println("Strong");
		else if ((hasLower || hasUpper || specialChar) && (n>=6))
			System.out.println("Moderate");
		else
			System.out.println("Weak");
	}
	
	public static void main(String[] args) {
		
		String input = "Shubham!@12";
		
		printStrongNess(input);
		
	}

}
