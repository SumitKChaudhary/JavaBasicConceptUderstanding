/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 CopyData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData 
{
	public static void main(String[] args) throws IOException {
		
		File concectFile = new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File1_Copyfrom.txt");
		
		if (concectFile.exists()) {
		FileReader readFileCharacter = new FileReader(concectFile);
		
		BufferedReader appendCharacter = new BufferedReader(readFileCharacter);
		
		String storeData= "";
		
		File createNewFile = new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File2_CopyTo.txt");
		
		FileWriter writeData = new FileWriter(createNewFile);
		
		BufferedWriter pastCopiedData = new BufferedWriter(writeData);
		
		
		while ((storeData=appendCharacter.readLine())!=null)
		{
			pastCopiedData.write(storeData);
			pastCopiedData.newLine();
		}
		
		pastCopiedData.close();
		System.out.println("Data successfully copied from "+concectFile.getName().toString()
				+" to new file"+createNewFile.getName().toString());
		
		
		}
		else 
		{
			System.out.println("File is not available on given path please check once.");
		}
		
	}

}
