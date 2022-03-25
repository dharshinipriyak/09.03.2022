package com.exceptionhandelling;
import java.util.Scanner;
//user defined exception
class CheckAge extends Exception
{
	public CheckAge(String s)
	{
		super(s);//calls super class constructor (Exception class)
	}
}
public class MainClass {
	public static void main(String[] args){

		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		try {
			if (age<18)
			{
			//throw new CheckAge("Not eligible for voting");
			//or create new object
			CheckAge obj=new CheckAge("Not eligible for voting");
			throw obj;
			}
			else
			{
				System.out.println("you can vote");
			}
		}
		catch(CheckAge e)
		{
			System.out.println("object "+e);
			e.printStackTrace();
		}
	}
}
