package com.exceptionhandelling;

public class example6 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int arr[]=new int[4];
		System.out.println("Before exception");
		try
		{
			System.out.println("inside try");
			c=a/b;
			arr[6]=9;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic Exception");
			e.printStackTrace();
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\n FinallyBlock");
		}

	}

}
