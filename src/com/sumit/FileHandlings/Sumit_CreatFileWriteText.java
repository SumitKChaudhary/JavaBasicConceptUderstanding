/**sumitkumar
 Sumit_CreateNewFile.java
 * 01-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sumitkumar
 *
 */
public class Sumit_CreatFileWriteText
{
	public static void main(String[] args) throws IOException {
		File createFile = new File("../sumit.javaproject/FileWriterNewFile.txt");
		
		FileWriter writeText = new FileWriter(createFile);
		
		writeText.write("My name is sumit"); //  if we can not user /n then the bother line write in one line. 
		// we can user bufferedWriter class 
		
		writeText.write("I'm Software Tester");
		writeText.close();
		
	}

}
