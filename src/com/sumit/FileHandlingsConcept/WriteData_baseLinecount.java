/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 21-Aug-2019
 *  FILE NAME  		: 	 WriteData_baseLinecount.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData_baseLinecount
{
	static Scanner sc = new Scanner(System.in);
	public  static void writeBasedOnLineCount(int lineNumber, String writeData) throws IOException
	{
		
		File createFile = new File("../BasicCoceptUnderstading/RepeatFileHandling/lineBasedData.txt");
		
		FileWriter fileWriterData = new FileWriter(createFile);
		
		BufferedWriter bufferWriterData = new BufferedWriter(fileWriterData);
	//	sc = new Scanner(System.in);
		
		for (int i=0 ; i<=lineNumber;i++ )
		{
			writeData=sc.nextLine();
			bufferWriterData.write(writeData);
			bufferWriterData.newLine();
			
		}
		bufferWriterData.close();
		System.out.println("Your enter data is wire successfully in file. Please check");
	}
	
	public static void main(String[] args) throws IOException {
		
		int lineNumbers; 
		System.out.println("How much line you like to write today.\n");
		lineNumbers=sc.nextInt();
		String dataString=""; 
		System.out.println("Start writing\n");
		writeBasedOnLineCount(lineNumbers, dataString);
	}
	
	
}
	