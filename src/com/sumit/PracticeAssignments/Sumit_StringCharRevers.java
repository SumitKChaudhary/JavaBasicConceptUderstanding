package com.sumit.PracticeAssignments;
/*@author		: 		Sumit Kumar 
 * ClassName	:		Sumit_StringMethods
 * Perpose		:		Check the different types of string reverse method 
 * Create date	:		2 March 2019 12:05:32 AM 
 * */

public class Sumit_StringCharRevers 
{
	public static String checkString= "My name is sumit ";
	public static String reverString="";
	
	public static void main(String[] args)
	{
		//find the lenght of the checkString variable 
		int length =checkString.length();
		//reverse the checkString and strore in reverString variable 
		
		
		for (int i = length - 1; i >= 0; i--)
			reverString = reverString + checkString.charAt(i);
		//print out the strored value
		
		System.out.println(reverString);
			//Result should be String My name is Sumit-------------timuS is eman yM

		
		
	}

}
