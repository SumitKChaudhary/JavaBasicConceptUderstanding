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
				}
			}
			else 
			{
					System.out.println("File not exist");
			}	
		//return line;
		
	}

}
