package com.java.exceptionHandling;

public class ExceptionHandlingExamples 
{
	public void arithmeticException()
	{
		int intnumberOne = 30;
		int intnum =0;
		int intex;
		try 
		{
			intex = intnumberOne/intnum;
			System.out.println("This is example of Arithmetic exception." +intex);			
			
		} catch (Exception arth) 
		{
			System.out.println("Cant divide by zero...");
		}
		System.out.println("===========");
	}
	
	public void nullpointerException()
	{
		try 
		{
			String strapple = null;
			System.out.println("This is an example of null pointer." +strapple.charAt(2));
		} catch (Exception point) 
		{
			System.out.println("Null Pointer Exception.");
		}	
		System.out.println("===========");
	}
	
	public void stringIndexOutOfBound()
	{
		try 
		{
            String stralpha = "This is example of Energy. "; // length is 22
            char character = stralpha.charAt(30); // accessing 25th element
            System.out.println(character);
        }
        catch(StringIndexOutOfBoundsException chart) 
		{
            System.out.println("String Index Out Of Bounds Exception Example. ");
        }
		System.out.println("===========");
	}
	
	public void numberformatException()
	{
		try 
		{
            int intnumber = Integer.parseInt ("Aditi") ;
            System.out.println("The name is: "+intnumber);
        } catch(NumberFormatException num) 
		{
            System.out.println("Number format exception");
        }
		System.out.println("===========");
	}
	
	public void arrayOutofBound()
	{
		try{
            int a[] = new int[10];
            a[4] = 9; // accessing 7th element in an array of
                      // size 5
            System.out.println("Array is available.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
	}

}
