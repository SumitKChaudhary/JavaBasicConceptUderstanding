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
		Scanner takeInput = new Scanner(System.in);
		
		System.out.println("Enter sentences to check words length");
		
		String enterSentences=takeInput.nextLine();
		
		String sentencesWords[]=enterSentences.split(" ");
		
		int increaseWordCount=0, wordsLength=0;
		System.out.println("Word"+"\t:\t"+"Word's Length");
		System.out.println("************************************************"+"\n");
		for(String word:sentencesWords)
		{
			for(int i=0; i<word.length(); i++)
			{
				wordsLength=word.length();
				wordsLength=wordsLength++;
			}
			System.out.println(word+"\t:\t"+wordsLength);
			increaseWordCount++;
		}
		
	}

}
