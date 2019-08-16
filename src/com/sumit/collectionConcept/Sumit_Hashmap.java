/**sumitkumar
 Sumit_Hashmap.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.HashMap;
import java.util.Set;

/**
 * @author sumitkumar
 *
 */
public class Sumit_Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// HashMap will not maintain the insertion order
		
		hm.put(1, "Sumit Kumar Chaudhary");
		hm.put(3, "Sachin Teotia");
		hm.put(4, "Kumar Saurav");
		hm.put(2, "Sonu Thakur");
		hm.put(6, "Harsh Lambah");
		hm.put(5, "Vikash Rai");
		
		Set<Integer> all=  hm.keySet();
		
		for(Integer i : all)
		{
			System.out.println(i+"   :    "+hm.get(i));
		}
		
	}

}
