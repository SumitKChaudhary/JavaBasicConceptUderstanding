/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 ReadExpectedLineNumberData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadExpectedLineNumberData 
{
	public static String readRequiredline (int lineNumber) throws IOException
	{
		
		File connectFile= new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File1_Copyfrom.txt");
	
	//	String specific_lineData="";
	     
	/*	Stream<String> all_lines = Files.lines(Paths.get(connectFile.toURI()));
	    		 
	    	specific_lineData = all_lines.skip(lineNumber).findFirst().get();
	    	
	    	System.out.println(specific_lineData);
	    	*/
	    	String specific_lineData = Files.readAllLines(Paths.get(connectFile.toURI())).get(lineNumber);
	    	System.out.println(specific_lineData);
	        
		return specific_lineData; 
		
	}
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the line number which you want to read from file ");
		
		int i = sc.nextInt();
		
		ReadExpectedLineNumberData objRead = new ReadExpectedLineNumberData();
		
		objRead.readRequiredline(i);
		
	}
		
		
}
