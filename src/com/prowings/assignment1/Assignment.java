package com.prowings.assignment1;

public class Assignment {

public static void main(String[] args) {
	
	
		String password1 = "abhikhade";
		
		if(password1.length() <= 7)
		{
			System.out.println("password is weak");
		}
		
		else if (password1 == "0" && password1 == "9")
		{
			System.out.println("password is medium");
			
		}
		else
		{
			System.out.println("not valid");
		}
	
		
	}

}
