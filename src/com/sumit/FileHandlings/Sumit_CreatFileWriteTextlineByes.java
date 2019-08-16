/**sumitkumar
 Sumit_CreatFileWriteTextlineByes.java
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
public class Sumit_CreatFileWriteTextlineByes 
{
	public static void main(String[] args) throws IOException {
		
		File newFile = new File("../sumit.javaproject/FileWriterNewFile line.txt");
		
		FileWriter writeText = new FileWriter(newFile);
		
		BufferedWriter buffWrite = new BufferedWriter(writeText);
	
		buffWrite.write("My name is sumit ");
		
		buffWrite.newLine();
		
		buffWrite.write("Contact number is : 9971458090");
		
		buffWrite.close();
		
		
	}

}
