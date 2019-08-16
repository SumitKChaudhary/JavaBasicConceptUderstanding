/**sumitkumar
 Sumit_ReadWithDataRange.java
 * 03-Apr-2019
 */
package com.sumit.FileHandlings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

/**
 * @author sumitkumar
 *  Read data with in range as given user input 
 */
public class Sumit_ReadWithDataRange 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your range you want read");

		int x=sc.nextInt();
		int y=sc.nextInt();
		
		File fPath = new File("../sumit.javaproject/RangeDataFile.txt");
		
		if (fPath.exists())
		{
			FileReader readChar = new FileReader(fPath) ;
			BufferedReader readLIne = new BufferedReader(readChar);
			String data = "";
			for (int i=0; i<x; i++)
			{
				data = readLIne.readLine();
			}
			for (int i=x; i<y; i++)
			{
				data=readLIne.readLine();
				System.out.println(data);
			}
		}
		else 
		{
			System.out.println("file is not exist please check again");
		}			 	
	}
}
