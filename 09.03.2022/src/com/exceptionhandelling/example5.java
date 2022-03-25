package com.exceptionhandelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example5 {

	public static void main(String[] args) throws IOException {
		// checked exception
		String name="";
		int age=0;
		float salary=0.0f;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("enter your Name");
		name=br.readLine();
			System.out.println("Enter your age");
			age=Integer.parseInt(br.readLine());
				System.out.println("Enter Salary");
				salary=Float.parseFloat(br.readLine());
		
		System.out.println("Details of Employee");
		System.out.println("Name    :"+name);
		System.out.println("Age     :"+age);
		System.out.println("Salary  :"+salary);
	}
}
