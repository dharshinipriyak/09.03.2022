
package com.exceptionhandelling;
//input firstname and last name from user
//if fname and lastname blank display exception message
//first name and last name not supposed to be blank using exception handelling

import java.util.Scanner;

class name extends Exception
{
	public name(String s)
	{
		super(s);
	}
}
public class ExerciseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname=null;
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter First name");
			fname=sc.nextLine();
			try {
			System.out.println("First Name is" +fname);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Enter valid fname");
		}
	  
		  System.out.println("Enter Lname");
		  lname=sc.nextLine();
		  try
		  {
		  System.out.println("Last Name is "+lname);
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace(); 
		 System.out.println("Enter valid lname");
	  }

	}

}
