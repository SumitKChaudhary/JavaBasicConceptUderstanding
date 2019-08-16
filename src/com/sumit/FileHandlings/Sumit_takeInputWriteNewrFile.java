/**sumitkumar
 Sumit_takeInputWriteNewrFile .java
 * 03-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author sumitkumar
 *
 */
public class Sumit_takeInputWriteNewrFile  
{
	public void dataWrite()throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data for save in file ");
		
		File filePath = new File("../sumit.javaproject/NewFile.txt");
		
		FileWriter fileWrite = new FileWriter(filePath,true);
		BufferedWriter buffWriter = new BufferedWriter(fileWrite);


		for (int a=1; a<=5; a++ ) 
		{
			//buffWriter.newLine();
			String data=sc.nextLine();
			buffWriter.write(data);
			buffWriter.newLine();	
		}
		
		buffWriter.close();
		System.out.println("\nYou input limit is completed");
	}
	
	public static void main(String[] args) throws IOException 
	{
		Sumit_takeInputWriteNewrFile  takeInput = new Sumit_takeInputWriteNewrFile();
		
		takeInput.dataWrite();
	}

}
