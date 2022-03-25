package com.exceptionhandelling;

import java.util.Scanner;

public class NullPointerExceptionType
{
	public static void main(String[] args) 
	{
		String N=null;
		Scanner sc=new Scanner(System.in);
		//read the string inside the try and catch block
		try {
		System.out.println("Enter name");
		N=sc.nextLine();
		System.out.println("Name:"+N);
	}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
