package com.exceptionhandelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String name;
		int age;
		float sal;
		
		//create buffered reader object
		//InputStreamReader is =new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(is);
		//or
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//in br we cant use nextline nextint 
		//we can use only readLine
		//readLine()->String
		//int age=Integer.parseInt(br.readLine());
		//float sal=Float.parseFloat(br.readLine());
		//long l=long.parse.Long(br.readLine());
		//char ch=sc.nextChar();
	
		System.out.println("Enter age:");
		age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the name:");
		name=br.readLine();
		
		System.out.println("Enter salary");
		sal=Float.parseFloat(br.readLine());
		
		//display
		System.out.println("Name   :"+name);
		System.out.println("Age    :"+age);
		System.out.println("salary :"+sal);
		
	}

}
