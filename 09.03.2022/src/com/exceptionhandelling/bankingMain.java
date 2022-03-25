package com.exceptionhandelling;
import java.util.Scanner;
class BankException extends Exception
{
	public BankException(String s)
	{
		super(s);
	}
}
class IndianBank
	{
	int bankbalance;
		public IndianBank() 
		{
			bankbalance=20000;
		}
	void withDraw(int withDrawAMT)
	{
		try
		{
			if(withDrawAMT>bankbalance) {
				throw new BankException("Insufficient balance");
			}
			else
			{
				bankbalance=bankbalance-withDrawAMT;
				System.out.println("Balance amount ="+bankbalance);
			}
		}
		catch(BankException e)
		{
			e.printStackTrace();
		}
	}
}

public class bankingMain {

	public static void main(String[] args) {
		
		IndianBank IB=new IndianBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		IB.withDraw(amt);
		
	}

}
