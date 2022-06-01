package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{
	public void getmap()
	{
		HashMap<Integer, String> objmap = new HashMap<Integer, String>();
		objmap.put(1, "Chetan Bhagat");
		objmap.put(2, "Preeti Shenoy");
		objmap.put(3, "Robin Sharma");
		objmap.put(4, "Amrish");
		objmap.put(2, "Amrish");//trying duplicate record
		
		 System.out.println("Few writers are: ");  
		 
		 for(Map.Entry m : objmap.entrySet())
		 {    
		    System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		 
		 System.out.println("Removing writer: "+objmap.remove(2));
		 System.out.println("Updated list: "+objmap);
		 System.out.println("Replacing: "+objmap.replace(4 ,"Preeti Shenoy"));
		 System.out.println("Updated list: "+objmap);
		 
	}

}
