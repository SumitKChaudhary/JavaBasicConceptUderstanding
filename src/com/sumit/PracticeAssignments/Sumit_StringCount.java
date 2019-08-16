package com.sumit.PracticeAssignments;

import java.io.*;

public class Sumit_StringCount
{
	public static void main(String[] args)throws IOException 
	//Signals that an I/O exception of some sort has occurred. This class is the general class of exceptions produced by failed or interrupted I/O operations.
	{
		
		File file = new File("/Users/sumitkumar/eclipse-workspace/sumit.javaproject/src/TestData/TestDataStringCount.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new  BufferedReader(input);
		String line ;
		// Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
         
        // Reading line by line from the  
        // file until a null is returned 
        while ((line = reader.readLine())!= null)
        {
        	if (line.equals(""))
        	{
        		paragraphCount	++;	
        	}
        	if (!(line.equals("")))
        	{
        		characterCount += line.length();
        		// \\s+ is the space delimiter in java 
        		String[] wordList = line.split("\\s+");
        		countWord += wordList.length; 
                whitespaceCount += countWord -1;                 
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+");     
                sentenceCount += sentenceList.length; 
        	}
        	 System.out.println("Total word count = " + countWord); 
             System.out.println("Total number of sentences = " + sentenceCount); 
             System.out.println("Total number of characters = " + characterCount); 
             System.out.println("Number of paragraphs = " + paragraphCount); 
             System.out.println("Total number of whitespaces = " + whitespaceCount); 
        }	
	}
}
