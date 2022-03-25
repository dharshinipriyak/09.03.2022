package com.exceptionhandelling;

import java.util.Scanner;

public class Employee {
 
	public static void main(String[] args) {
		int age;
		String name;
		double fees;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your age");
		age=sc.nextInt();
			System.out.println("Enter your Name");
			name=sc.nextLine();
			System.out.println("Enter your fees");
			fees=sc.nextDouble();
		
			System.out.println("Age     :"+age);
			System.out.println("Name    :"+name);
			System.out.println("Fees    :"+fees);
		sc.close();
			
			
		
	}
}
