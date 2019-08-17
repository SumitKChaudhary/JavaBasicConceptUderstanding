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

public class CopyData 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		File concectFile = new File("../BasicCoceptUnderstading/RepeatFileHandling/File1_Copyfrom.txt");
		
		FileReader readFileCharacter = new FileReader(concectFile);
		
		BufferedReader appendCharacter = new BufferedReader(readFileCharacter);
		
		String storeData= null;
		
		
		
	}

}
