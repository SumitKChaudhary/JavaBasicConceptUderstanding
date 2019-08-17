/**sumitkumar
 Sumit_PrintRequiredLine.java
 * 06-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

import com.sumit.interviewPractice.Main;

/**
 * @author sumitkumar
 *
 */
public class Sumit_PrintRequiredLine 
{
	public void readData (int line) throws IOException
	{
			File filePath = new File("../JavaBasicConceptUderstanding/FileHandlingData/ReadData.txt");
			
			if (filePath.exists())
			{
				FileReader readChar = new FileReader(filePath);
				
				LineNumberReader readLines = new LineNumberReader(readChar);
				
				String str = null;
				//line =0;
				
				while(readLines.getLineNumber()!=line)
				{
					str=readLines.readLine();
					System.out.println(str);
				}
			}
			else 
			{
					System.out.println("File not exist");
			}	
		//return line;
	}
	public static void main(String[] args) throws IOException {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line number which you want to read from file");
		int n = sc.nextInt();
		
		Sumit_PrintRequiredLine refObj = new Sumit_PrintRequiredLine();
		
		refObj.readData(n);
	}

}
