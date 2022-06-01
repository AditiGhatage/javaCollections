package com.java.exceptionHandling;

public class ThrowThrowsException 
{
	public void checkage()
	{
		System.out.println("Checking Eligibility for Voting.");
		int intage = 26;
		if(intage<18)
		{
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else
		{
			System.out.println("Access Granted.");
		}
	}
	
	public void checkThrows() 
	{
		   try
	        {
	            throw new NullPointerException("demo");
	        }
	        catch(NullPointerException example)
	        {
	            System.out.println("Caught inside fun().");
	            throw example; // rethrowing the exception
	        }
		
	}

}
