/**sumitkumar
 Sumit_LinkedHasMap.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author sumitkumar
 *
 */
public class Sumit_LinkedHasMap 
{
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		//LinkedHasMap will maintain the insertion order 
		lhm.put(1,"Sumit");
		lhm.put(4,"Amit");
		lhm.put(2,"Sachin");
		lhm.put(5,"Saurav");
		lhm.put(3,"Sonu");
		
		Set<Integer> all=	lhm.keySet();
		
		for (Integer i : all)
		{
			System.out.println(i+"  :  "+lhm.get(i));
		}
		
		
	}

}
