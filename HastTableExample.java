package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HastTableExample 
{
	public void gethashtable()
	{
	Enumeration names;
	String keyword;
	
	Hashtable<String, String> objhashtable = new Hashtable<String, String>();
	
	objhashtable.put("Student Name "," Aditi Ghatage");
	objhashtable.put("Student Exam No. ", " ABC123");
	objhashtable.put("PhoneNumber ", " 9123578373");
	objhashtable.put("Subject_1 ", " Chemistry");
	objhashtable.put("Subject_2 ", " History");
	objhashtable.put("Subject_3 ", " Geography");
		
	System.out.println("Student details are: " +objhashtable); // Displaying the size of the table
	System.out.println("The size of the table is " + objhashtable.size());
	System.out.println("==============================");
	 names = objhashtable.keys();
	 while(names.hasMoreElements()) {
	 keyword = (String) names.nextElement();
	 System.out.println(keyword+ " = " +objhashtable.get(keyword));
	 }
	}

}
