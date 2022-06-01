package com.java.exceptionHandling;

public class FinallyBlock 
{
	public void finallyexecution()
	{
		try {
	      int[] myNumbers = {15, 22, 35,56,78};
	      System.out.println(myNumbers[10]);
	    } catch (Exception simple) {
	      System.out.println("Something went wrong.");
	    } finally {
	      System.out.println("The code is invalid.");
	    }
		System.out.println("===============");
	}
	
	public void withoutcatch() throws Exception
	{//the finally block is executed even in the case of an unhandled exception
		try {
		    System.out.println("Inside try");
		    throw new Exception();
		} finally {
		    System.out.println("Inside finally");
		}
	}
}
