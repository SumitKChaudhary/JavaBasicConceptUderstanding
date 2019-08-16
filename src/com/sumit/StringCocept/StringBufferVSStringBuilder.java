/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 23-Jul-2019
 *  FILE NAME  		: 	 StringBufferVSStringBuilder.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.StringCocept;
public class StringBufferVSStringBuilder 
{
	public static void concateString (String str)
	{
		str = str + "Sumit";
	}
	public static void concateStringBuffer (StringBuffer strBuffer)
	{
		strBuffer.append("Sumit");
	}
	public static void concateStringBuilder (StringBuilder strBuilder)
	{
		strBuilder.append("sumit"); 
	
	}
	
	public static void main(String[] args) {
		
		String str = "Kumar";
		
		concateString(str);
		
		System.out.println("concatinate string using String object \t:\t "+str);
		
		StringBuffer strBuffer = new StringBuffer("Kumar"+" ");
		
		concateStringBuffer(strBuffer);
		
		System.out.println("Concate the string using String buffer \t:\t"+strBuffer);
		
		StringBuilder strBuilder = new StringBuilder("kumar"+" ");
		
		concateStringBuilder(strBuilder);
		System.out.println("Concate the string using String Builder \t:\t"+strBuilder);
	}
}
