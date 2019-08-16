package com.sumit.interviewPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sumit_StringCounter 
{
	public static void main(String[] args) throws IOException 
	{
		File targetFile = new File("../BasicCoceptUnderstading/StringCount.txt");
		
		int paragrapah =1;
		int wordCount =0;
		int charCount=0;
			
		if (targetFile.exists())
		{
			FileReader readFile = new FileReader(targetFile); 
	   
	        BufferedReader reader = new BufferedReader(readFile); 
			
	        String str = " ";
	        while ((str=reader.readLine())!=null)
			{
				if (str.equals(""))  
				{
					paragrapah++;
				}
				if (!(str.equals("")))
				{
					charCount += str.length(); // store the length of characters 
					
					String [] strWord = str.split(" ");
					wordCount += strWord.length;
					
				}
				
				
			}
	        System.out.println("Paragraph Count\t:\t"+paragrapah);
	        System.out.println("\nWord Count\t:\t"+wordCount);
	        System.out.println("\nCharacter Count\t:\t"+charCount);
		}
		else
		{
			System.out.println("File is not exist please check");
		}
		
		
		
	
		
		
		
		
		
		
	}

}
