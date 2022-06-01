package com.java.exceptionHandling;

import java.io.IOException;

public class TestThrowsException 
{
	public static void main(String[] args) throws IOException
	{
		ThrowsException objthrows = new ThrowsException();
		//objthrows.findFile();
		objthrows.multipleCatch();
	}

}
