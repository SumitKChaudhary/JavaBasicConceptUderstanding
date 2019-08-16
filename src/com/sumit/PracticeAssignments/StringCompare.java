package com.sumit.PracticeAssignments;

public class StringCompare 
{
	
	public static String s1= new String("Sumit");// Memory will locate from the heap
	public static String s2 ="Kumar"; // SCP String Concepts Pool 
	
	
	
	public static void main (String [] args)
	{
		// Evaluates to false
		System.out.println("Compare method");
		if (s1==s2)  //== use for compare tow variables 
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		// Evaluates to true

		System.out.println("Equal method");
		if (s1.equals(s2))
			
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		// Add two variable value
		String concate = s1.concat(s2);
		/* We can concatenate the value with the concat method
		  * but if we print s1. then out from s1 variable because string is mutable variable we can't change  	
		  * If we want to add the value in s1 variable then we need to create another variable con			
		  */
		
		System.out.println("After Concatinate the value "+s1);// out from s1. variable 
		System.out.println(concate);// concate variable store the both value with the help of concat method
	}

}
/*Notes
 *String is mutable class we can not add something with helping another variable
 * == handles null strings fine, but calling .equals() from a null string will cause an exception: 
 * */
 