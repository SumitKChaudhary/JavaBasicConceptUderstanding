/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 Write_UserEnteredData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Write_UserEnteredData
{
	public static void main(String[] args) throws IOException {
		
		File connectFile = new File("../JavaBasicConceptUderstanding/RepeatFileHandling/InputFromUserAssignment.txt");
		if (connectFile.canRead())
		{
			FileWriter writeData = new FileWriter(connectFile);
			BufferedWriter writeDataNewLine = new BufferedWriter(writeData);
			Scanner sc = new Scanner(System.in);
			int n=0; 
			System.out.println("Enter how much line you want to print in file");
			n=sc.nextInt();
			System.out.println("Enter the data to wite in file ");
			
			String userInputedData; 
			
			for (int i=0; i<=n; i++)
			{
				userInputedData= sc.nextLine();
				writeDataNewLine.write(userInputedData);
				writeDataNewLine.newLine();
			}
			writeDataNewLine.close();
			System.out.println("Inputed data write successfully");
		}
		else
		{
			System.out.println("File is not available please check");
		}
	}

}
