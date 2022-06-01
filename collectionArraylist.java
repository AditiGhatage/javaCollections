package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionArraylist 
{
	public void getCities()
	{
		List<String> myobjlist=new ArrayList<String>();//Creating arraylist
		myobjlist.add("Kolhapur");//Adding object in arraylist
		myobjlist.add("Sangli");
		myobjlist.add("Satara");
		myobjlist.add("Yavatmal");
		myobjlist.add("Kagal");
		myobjlist.add("Pune");
		myobjlist.add("Mumbai");
		myobjlist.add("Mumbai");
		
		System.out.println("List of cities is:");
		
		//Array list using iterator
		Iterator<String> itrlist = myobjlist.iterator();
		while (itrlist.hasNext()) {
			//String string = (String) itrlist.next();
			System.out.println(itrlist.next());
		}
		
		System.out.println("====================================");
		System.out.println("Cities are: "+myobjlist.toString());
		System.out.println("Choose City name is : "+myobjlist.get(1));
		System.out.println("Removed City name is : "+myobjlist.remove(3));
		System.out.println("New Cities are: "+myobjlist.toString());
		System.out.println("Size of the list is: "+myobjlist.size());
		System.out.println("After removing all cities: "+myobjlist.removeAll(myobjlist));
		System.out.println("Is array list empty? " +myobjlist.isEmpty());
		myobjlist.clear();
		System.out.println("After clearing...." +myobjlist);
		System.out.println("Is array list empty? " +myobjlist.isEmpty());
		
	}

}
