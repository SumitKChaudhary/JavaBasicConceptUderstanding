/**sumitkumar
 Sumit_TreeSet.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.TreeSet;

/**
 * @author sumitkumar
 *
 */
public class Sumit_TreeSet
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		//TreeSet it will give you in shorting order ascending
		tSet.add(1);
		tSet.add(3);
		tSet.add(4);
		tSet.add(2);
		tSet.add(5);
		
		for (int a : tSet)
		{
			System.out.println(a);
		}
		
		
	}

}
