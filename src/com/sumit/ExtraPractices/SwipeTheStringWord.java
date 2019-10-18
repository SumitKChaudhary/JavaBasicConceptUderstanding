/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Oct-2019
 *  FILE NAME  		: 	 SwipeTheStringWord.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;
public class SwipeTheStringWord 
{
	public static void main(String[] args) 
	{
		String originalSentence = "My name is sumit";
		System.out.println("Original Sendtence is \n"+originalSentence);
		System.out.println("***** After Reverse in Different ways **********\n\n");
		
		String reverseSentence ="";
		
//*********************************************************  METHOD 1 **********************************************************************		
		for(int i=originalSentence.length()-1; i>=0;i--)
		{
			reverseSentence=reverseSentence+originalSentence.charAt(i);
		}
		
		System.out.println("Method 1 \t:\t"+reverseSentence);// timus si eman yM
		
		String words[] =originalSentence.split(" ");
//*********************************************************  METHOD 2 **********************************************************************		
		System.out.print("Method 2 \t:\t");

		for(int i=words.length-1; i>=0; i--) 
		{
			System.out.print(words[i]+" ");//sumit is name My 
		}
		System.out.println(); 
//*********************************************************  METHOD 3**********************************************************************		
		System.out.print("Method 3 \t:\t");
		
		String reverseSentence1 ="";
			for(String word: words)
			{
				String revWord ="";
				for(int j=word.length()-1; j>=0;j--)
				{
					revWord = revWord+word.charAt(j);
				}
				
				reverseSentence1 = reverseSentence1+revWord+" ";
				
			}
		System.out.println(reverseSentence1);//yM eman si timus
	}

}
