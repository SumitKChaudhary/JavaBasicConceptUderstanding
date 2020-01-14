package com.sumit.PracticeAssignments;
/*@author		: 		Sumit Kumar 
 * ClassName	:		Sumit_StringMethods
 * Perpose		:		Check the different types of string reverse method 
 * Create date	:		2 March 2019 12:05:32 AM 
 * */

public class Sumit_StringCharRevers 
{
	public static String checkString= "My name is sumit ";
	public static String reversString="";
	
	public static void main(String[] args)
	{
		//reverse the checkString and stored in reversString variable
		
		
		for (int i = checkString.length() - 1; i >= 0; i--) {
			reversString = reversString + checkString.charAt(i);
			//print out the stored value
		}
		System.out.println(reversString);
			//Result should be String My name is Sumit-------------timuS is eman yM

		
		
	}

}
