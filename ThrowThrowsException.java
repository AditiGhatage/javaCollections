package com.java.exceptionHandling;

public class ThrowThrowsException 
{
	public void checkage()
	{
		System.out.println("Checking Eligibility for Voting.");
		int intage = 6;
		if(intage<18)
		{
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else
		{
			System.out.println("Access Granted.");
		}
	}

}
