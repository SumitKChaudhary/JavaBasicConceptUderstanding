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

	public static String characterCount(String enterSentences)
	{
		String character = " ";
		//Create an char array of given String
		char[] strCharacter = enterSentences.toCharArray();
		for(int i =0; i<strCharacter.length;i++)
		{
			//Declare an String with empty initialization for storing character

			//When the characters is not space
			while (i<strCharacter.length && strCharacter[i]!=' ')
			{
				//concate with the declared String
				character=character+strCharacter[i];
				i++;
			}


		}

		return  character;
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence ");
		String sentences=sc.nextLine();

		int words= CountTheString.stringWordCount(sentences);

		String characters=CountTheString.characterCount(sentences);

		System.out.println(words+"  words  "+characters+"  characters");

	}
	

}
