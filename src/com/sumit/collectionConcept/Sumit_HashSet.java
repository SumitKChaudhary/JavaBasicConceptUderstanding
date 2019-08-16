/**sumitkumar
 Sumit_HashSet.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.HashSet;

/**
 * @author sumitkumar
 *
 */
public class Sumit_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>(); // <integer > means we can store only integer value. 
		//HashSet will not maintain the variable insertion order
		
		hs.add(5);
		hs.add(2);
		hs.add(1);
		hs.add(4);
		hs.add(3);
		
		for (Integer a : hs) // : means each its help to store all variable in a from hs one by one
		{
			System.out.println(a);
		}
		
		HashSet<String> strHas = new HashSet<String>();
		strHas.add("Sumit");
		strHas.add("Sachin");
		strHas.add("Saurav");
		strHas.add("Amit");
		strHas.add("Vivek");
		
		for (String name : strHas)
		{
			System.out.println(name);
		}
	}

}
