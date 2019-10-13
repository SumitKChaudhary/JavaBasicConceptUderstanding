/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Oct-2019
 *  FILE NAME  		: 	 SentencesWordLength.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.Scanner;

public class SentencesWordLength 
{
	public static void main(String[] args) 
	{
		//Taking scanner class for input from user 
		Scanner takeInput = new Scanner(System.in);
		
		System.out.println("Enter sentences to check words length");
		//store all entered value to string variable
		String enterSentences=takeInput.nextLine();
		//Remove space and Breaks sentences in words and store in string of array
		String sentencesWords[]=enterSentences.split(" ");
		//taking two integer variable
		int increaseWordCount=0, wordsLength=0;
		
		System.out.println("Word"+"\t:\t"+"Word's Length");
		System.out.println("************************************************"+"\n");
		//Getting here word by word from array and store in string variables
		for(String word:sentencesWords)
		{
			//getting here length of each words 
			for(int i=0; i<word.length(); i++)
			{
				//store all words length 
				wordsLength=word.length();
				//increase length for every words
				wordsLength=wordsLength++;
			}
			//Print all data
			System.out.println(word+"\t:\t"+wordsLength);
			//increase the count for taking all words 
			increaseWordCount++;
		}
		
	}

}
