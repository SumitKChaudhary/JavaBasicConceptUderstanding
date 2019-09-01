/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 31-Aug-2019
 *  FILE NAME  		: 	 CreateMultipleSheet.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.ExcelFileHandlingApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheet 
{
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File createFile = new File("../BasicCoceptUnderstading/CreateMultipleSheet.xls");
		
		FileOutputStream createFileout = new FileOutputStream(createFile);
				
		XSSFWorkbook createExcelFile = new XSSFWorkbook();
		
		XSSFSheet createSheet = createExcelFile.createSheet("Sumit");
		
		
		int a=0;
		
		for(int i=0; i<3; i++)

		{
			XSSFRow createRaRow = createSheet.createRow(i);
			
			for (int j=0; j<3; j++)
			{
				XSSFCell createCell = createRaRow.createCell(j);
				
				createCell.setCellValue("Sumit"+a);
				a++;
			}
		}
		
		createExcelFile.write(createFileout);
		createFileout.flush();
		createExcelFile.close();
		System.out.println("File Created Successfully");
		
		
	
		
		
		
		
		
		
	}

}
