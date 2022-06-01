package com.java.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsException 
{
	public void findFile() throws IOException
	{   // code that may produce IOException
		    File newFile=new File("test.txt");
		    FileInputStream stream=new FileInputStream(newFile);
		    //throw new IOException("File not found");
		    try
		    {
		        findFile();
		    } catch(IOException ethrow)
		    {
		        System.out.println("File not found..."+ethrow.getMessage());
		    }
	}
	
	public void multipleCatch()
	{
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 0;
		    } catch (ArithmeticException exam) 
			{
		      System.out.println(exam.getMessage());
		    } catch (ArrayIndexOutOfBoundsException alpha) 
			{
		      System.out.println(alpha.getMessage());
		    } 
	}
}
