/**sumitkumar
 Sumit_LinkedHasSet.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.LinkedHashSet;

/**
 * @author sumitkumar
 *
 */
public class Sumit_LinkedHasSet
{
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lHs = new LinkedHashSet<Integer>();
		// LinkedHasSet it will maintain the insertion order
		
		lHs.add(1);
		lHs.add(4);
		lHs.add(5);
		lHs.add(2);
		lHs.add(3);
		
		for (Integer a : lHs)
		{
			System.out.println(a);
		}
		LinkedHashSet<String> strValue = new LinkedHashSet<String>();
		// LinkedHasSet it will maintain the insertion order
		
		strValue.add("A");
		strValue.add("C");
		strValue.add("E");
		strValue.add("B");
		strValue.add("D");
		
		for (String b : strValue)
		{
			
			System.out.println(b);
		}
		
	}

}
