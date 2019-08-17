/**
 * @author 			:	 sumit
 *	DATE       		:	 17-Aug-2019
 *  FILE NAME  		: 	 ReadExpectedLineNumberData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.FileHandlingsConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ReadExpectedLineNumberData 
{
	public static void main(String[] args) throws IOException {
		
		File connectFile= new File("../JavaBasicConceptUderstanding/RepeatFileHandling/File1_Copyfrom.txt");
		
		FileReader readfile = new FileReader(connectFile);
		
		BufferedReader readFileData = new BufferedReader(readfile);
		
		String dataStore = null;
		
		while ((dataStore=readFileData.readLine())!=null)
		{
			if(dataStore.length()<2)
			{
				System.out.println(dataStore);
			}
			//System.out.println(dataStore);
		}
	}

}
