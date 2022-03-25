package com.exceptionhandelling;

public class example4 {

	public static void main(String[] args) {
		//try catch
		
		String s="java";
		System.out.println("Before parseInt");
		try {
			
		int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("after parseInt");
	}

}
