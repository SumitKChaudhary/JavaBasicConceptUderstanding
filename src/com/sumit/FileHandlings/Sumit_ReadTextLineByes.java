/**sumitkumar
 Sumit_BufferFileReader.java
 * 31-Mar-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sumitkumar
 * how to read a data from txt (line by line ) and print in console
 */
public class Sumit_ReadTextLineByes
{

	public static void main(String[] args) throws IOException {
		
		File storeFile_Path = new File("../sumit.javaproject/Filehandle.txt");// storeFile_Path   read file and store the given path
		
		FileReader readChracter_File = new FileReader(storeFile_Path);  // readCharacter_File variable read a character by character
		
		BufferedReader buffRead_Santence = new BufferedReader(readChracter_File); // buffRead_Satence appending every character and convert in sentence line by line. 
		
		String storeSatence; // buffread store a binary code then storeSatence store as string
		
		//while((fileText=fileRead.read())!=-1)
		
		
		while ((storeSatence=buffRead_Santence.readLine())!=null)// 
		{
			System.out.println(storeSatence);
		}
		
	}
}
