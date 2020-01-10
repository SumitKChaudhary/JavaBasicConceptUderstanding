/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 01-Aug-2019
 *  FILE NAME  		: 	 CountTheStringChar.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class CountTheString
{

	public static int stringWordCount(String enterSentences)
	{
		String [] removedSpace= enterSentences.split(" ");

		return removedSpace.length;
	}

	public static int characterCount(String enterSentences)
	{
		char[] characters = enterSentences.toCharArray();
		return  characters.length;
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence ");
		String sentences=sc.nextLine();

		int words= CountTheString.stringWordCount(sentences);

		int characters=CountTheString.characterCount(sentences);

		System.out.println(words+"  words  "+characters+"  characters");

	}
	

}
