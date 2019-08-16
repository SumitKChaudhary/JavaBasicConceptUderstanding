/**sumitkumar
 Sumit_CountLinenumbers.java
 * 05-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author sumitkumar
 *
 */
public class Sumit_CountLinenumbers 
{
	public static void main(String[] args) throws IOException 
	{

		File fPath = new File("../sumit.javaproject/RangeDataFile.txt");
		
		if (fPath.exists())
		{
			FileReader readFile = new FileReader(fPath);
			
			BufferedReader lineNumber = new LineNumberReader(readFile);
			
			int getLines=0; 
			
			while(lineNumber.readLine()!=null)
			{
				getLines++;

			}
			System.out.println("Total number of the line in RangeDataFile \n"+getLines);
			lineNumber.close();
					
		}
		else {
			System.out.println("file does not exists");
		}
		}

}
