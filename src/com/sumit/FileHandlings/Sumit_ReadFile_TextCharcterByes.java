/**sumitkumar
 Sumit_ReadFile_Text.java
 * 31-Mar-2019
 */
package com.sumit.FileHandlings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sumitkumar
 * how to read data from txt file (character by character) and print in console 
 */
public class Sumit_ReadFile_TextCharcterByes
{
	public static void main(String[] args) throws IOException 
	{
		File sumitFile = new File("../sumit.javaproject/Filehandle.txt"); // Create a connection with file Or locate a file 
		
		FileReader fileRead = new FileReader(sumitFile); // File reader read a content from file character by character
		int fileText; // file read character value and content to byte code after that store in file text variable
		
		while((fileText=fileRead.read())!=-1)// Run the while loop for read all character and exit after the end . It return a data or -1 
		{
			System.out.println((char)fileText);// here we convert the integer value to character implicitly 
		}
		{
			
		}

		
		
		
	}

}
