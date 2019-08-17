/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 CopyData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CopyData 
{
	public static void main(String[] args) throws IOException {
		
		File concectFile = new File("../BasicCoceptUnderstading/File1_Copyfrom.txt");
		
		if (concectFile.exists()) {
		FileReader readFileCharacter = new FileReader(concectFile);
		
		BufferedReader appendCharacter = new BufferedReader(readFileCharacter);
		
		String storeData= null;
		
		while ((storeData=appendCharacter.readLine())!=null)
		{
			storeData+=storeData;
		}
		
		
		System.out.println(storeData);
		}
		else 
		{
			System.out.println("File is not available on given path please check once.");
		}
		
	}

}
