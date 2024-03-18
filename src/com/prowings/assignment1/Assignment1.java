package com.prowings.assignment1;

public class Assignment1 {

	public static void checkPasswordStrength(String pasword) {

		String pass = "shubham";
		if (8 <= pass.length()) {
			int countnum = 0;
			int strcount = 0;
			int spechrcount=0;
			for (int i = 0; i < pass.length(); i++) {
				char ch = Character.toUpperCase(pass.charAt(i));

				if ((ch >= '0' && ch <= '9')) {

					countnum++;
				}
				if (('A' >= Character.toUpperCase(pass.charAt(i)))) {
					strcount++;
				}
				if(('@'==ch||'#'==ch||'$'==ch)) {
					spechrcount++;
				}

			}
			if(strcount>=2&&countnum>=2&&spechrcount>0) {
				System.out.println("this password is Strong");
				
			}
			else if(strcount>=2&&countnum>=2) {
				System.out.println("this password is medium");
				
			}
		}
		else {
				System.out.println("this password is week");
			}

		}

	

	public static void main(String[] args) {

		checkPasswordStrength("shubham1234");

	}

}
