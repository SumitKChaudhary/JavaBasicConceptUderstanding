/**sumitkumar
 Sumit_CopyToNewData.java
 * 03-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sumitkumar
 *
 */
public class Sumit_CopyToNewData 
{
	public static void main(String[] args) throws IOException 
	
	
	{	//../sumit.javaproject/
		File firstDataFile = new File("../sumit.javaproject/ReadData.txt");
		
		FileReader readFile_Data_Character = new FileReader(firstDataFile);
		
		BufferedReader storeLineByes = new BufferedReader(readFile_Data_Character); 
		
		String storeData;
		
		
		File secondStorageFile = new File("../sumit.javaproject/DataStorageFile.txt");
		
		FileWriter copyFromReadData = new FileWriter(secondStorageFile, true);
		
		BufferedWriter writeCopyData = new BufferedWriter(copyFromReadData);
		
		writeCopyData.write("After copied from ReadData file \n ");
		
		writeCopyData.newLine();
		
		
		while((storeData=storeLineByes.readLine())!=null)
		{
			
			writeCopyData.write(storeData);
			writeCopyData.newLine();
		}
		writeCopyData.close();
		
		System.out.println("Successfully copied the data readData to DataStorage ");
		
	}
	
	
	

}
