/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Aug-2019
 *  FILE NAME  		: 	 CountTheStringChar.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;
public class CountTheString 
{
	
	public static int wordCount(String str) 
	{
		int count = 0 ;
		
		char ch[]= new char[str.length()];
		
		for (int i=0;  i<=str.length(); i++)
		{
			ch[i]=str.charAt(i);
			
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0))) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		
		String str = "India is my counry"; 
		
		System.out.println(wordCount(str)+"word");
		
		
		 
		 
	}
	

}
