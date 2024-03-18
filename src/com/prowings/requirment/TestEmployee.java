package com.prowings.requirment;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(123,"Ram",10000l);
		Employee e2 = new Employee(456,"Sham",20000l);
		Employee e3 = new Employee(789,"Khrisna",30000l);
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		
		findMax(empList);
		
	}
	
	public static void findMax(List<Employee>empList) {
		
		
		System.out.println(empList);
		
		
	}

}
