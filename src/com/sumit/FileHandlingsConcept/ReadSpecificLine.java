/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 ReadSpecificLine.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadSpecificLine
{
	public static String readRequiredline (int lineNumber) throws IOException
	{
		
		File connectFile= new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File1_Copyfrom.txt");
	
		FileReader readCharacter = new FileReader(connectFile);
		BufferedReader readLines = new BufferedReader(readCharacter);
		String specific_lineData="";
		while((specific_lineData=readLines.readLine())!=null)
		{
			for(int i =0 ; i<specific_lineData.length(); i++)
			{
				if (i==lineNumber)
				{
					System.out.println(specific_lineData);
				}
				else
				{
					System.out.println("Line number not found please enter according to data");
				}
			}		
		}
	        
		return specific_lineData; 
		
	}
	public static void main(String[] args) throws IOException  	 {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int specificNumber = sc.nextInt();
		ReadExpectedLineNumberData.readRequiredline(specificNumber);
	}

}
