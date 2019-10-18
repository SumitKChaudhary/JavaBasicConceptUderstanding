/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Oct-2019
 *  FILE NAME  		: 	 ConflictStringCompare.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.TrickyQuestionsSolutions;
public class ConflictStringCompare
{
	public static void main(String[] args) 
	{
		String one = "Random";
		
		String two = "Random"; 
		String one1 = new String("Random");
		String two1 = new String("Random");
		
		if(one==two)// == check the memory location of the reference variable instead of values 
		{
			System.out.println("Check reference vriable memory using == operator"+"One==two");
		}
		else
		{
			System.out.println("Check reference vriable memory using == operator"+"One!=two");
		}
		
		if(one.equals(two))//check the value of the reference variable instead of memory location
		{
			System.out.println("Check reference vriable values using equals method"+"One==two");
		}
		else
		{
			System.out.println("Check reference vriable values using equals method"+"One!=two");
		}
		
		if(one1==two1)
		{
			System.out.println("One==two");
		}
		else
		{
			System.out.println("One!=two");
		}

		if(one1.equals(two1))
		{
			System.out.println("One==two");
		}
		else
		{
			System.out.println("One!=two");
		}
		if(one1.equals(two))
		{
			System.out.println("One==two");
		}
		else
		{
			System.out.println("One!=two");
		}
			
			
		
		
	}

}
