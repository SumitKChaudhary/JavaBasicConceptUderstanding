/**sumitkumar
 Sumit_List_ArrayList.java
 * 05-May-2019
 */
package com.sumit.collectionConcept;

import java.util.ArrayList;

/**
 * @author sumitkumar
 *
 */
public class Sumit_List_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(4);
		arrList.add(3);
		arrList.add(2);
		
		for (int a : arrList)
		{
			System.out.println(a);
		}
		
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("Sumit");
		strArr.add("Sachin");
		strArr.add("Saurav");
		
		for (String b : strArr)
		{
			System.out.println(b);
		}
		
		
		
		
	}

}
