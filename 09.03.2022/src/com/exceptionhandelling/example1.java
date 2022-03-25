package com.exceptionhandelling;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Before Division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("catch block execute only when exception occured");
		}
		finally
		{
			System.out.println("Finally block executes always");
		}
		System.out.println("after division");
	}

}
