/**
 * @author 			:	 sumit
 *	DATE       		:	 18-Aug-2019
 *  FILE NAME  		: 	 Readrangedata.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readrangedata 
{
	public static String rangeDataRead(int startNum, int endNum) throws IOException {
		
		File connectFile = new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File1_Copyfrom.txt");
		
		FileReader readFileData = new FileReader(connectFile);
		BufferedReader readLines = new BufferedReader(readFileData);
		
		String fileData=null;
		int r=0;
		while ((fileData=readLines.readLine())!=null)
		{
			++r;
			if((r>=startNum)&&(r<=endNum))
			{
				System.out.println(fileData);
			}
			
		}
		
		return fileData;
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range ");
		
		int strNum, enNum; 
		
		strNum=sc.nextInt();
		enNum=sc.nextInt();
		//call the method 
		rangeDataRead(strNum, enNum);
	}

}
