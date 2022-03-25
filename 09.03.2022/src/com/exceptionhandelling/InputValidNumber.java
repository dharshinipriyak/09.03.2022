package com.exceptionhandelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidNumber {

	public static void main(String[] args) {
		// NumberedReader
		Scanner sc=new Scanner(System.in);
		int num;
		//while(true) 
		for(;;)
		{
			System.out.println("Enter valid Number");
			try {
				num=Integer.parseInt(sc.next());
				break; //while loop
				}
			catch(NumberFormatException e)
			 {
				e.printStackTrace();
			 }
			catch(InputMismatchException e) 
				{
				e.printStackTrace();
				}
					System.out.println("Please enter valid Integer Only");
		}
		System.out.println("Input is valid");
		sc.close();
	}

}
