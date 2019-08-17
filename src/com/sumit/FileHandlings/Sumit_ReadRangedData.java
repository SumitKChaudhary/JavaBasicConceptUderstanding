/**sumitkumar
 Sumit_ReadRangedData.java
 * 06-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sumitkumar
 *
 */
public class Sumit_ReadRangedData 
{
	public static void readData(String fileName, int startLine,int endLine) throws IOException
	{
		
		BufferedReader readLine = new BufferedReader(new FileReader(fileName));
			String line;
			while (startLine<=endLine)
			{
				line=readLine.readLine();
				if (line==null)
				{	
					return;
				}
				System.out.println(line);
				startLine++;
			}
	}
	 public static void main(String[] args) throws IOException 
	 {
		 	
		 	
		 	readData("../JavaBasicConceptUderstanding/FileHandlingData/NewFile.txt", 2, 3);
	}

}
