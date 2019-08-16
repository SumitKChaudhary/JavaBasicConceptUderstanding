/**sumitkumar
 Sumit_CreateNewAppendData.java
 * 01-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sumitkumar
 *
 */
public class Sumit_CreateNewAppendData 
{
	public static void main(String[] args) throws IOException 
	{
		File newFile = new File("../sumit.javaproject/AppendTextInNewline.txt");
		
		FileWriter writeText = new FileWriter(newFile,true);
		
		BufferedWriter buffWrite = new BufferedWriter(writeText);
		
		buffWrite.newLine(); 
		
		buffWrite.write("I'm unmarriede");
		
		buffWrite.newLine();
		
		buffWrite.write("I love to enjoye party ");
		
		buffWrite.close();
		
	}
}
