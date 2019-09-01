/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 30-Aug-2019
 *  FILE NAME  		: 	 CreateExcelFileAPOI.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.ExcelFileHandlingApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFileAPOI {

	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File createFile = new File("../BasicCoceptUnderstading/XLSXFile_create.xlsx");
		
		FileOutputStream createExcelFile = new FileOutputStream(createFile);
		
		XSSFWorkbook createExcel = new XSSFWorkbook();
		
		XSSFSheet createSheet = createExcel.createSheet("WriteSheet");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Data which you want to save in Excel file. ");
		String enteredData; 
		
		for (int i=0; i<3; i++)
		{
			XSSFRow createRow = createSheet.createRow(i);
			
			for(int j=0; j<3; j++)
			{
				XSSFCell createCell = createRow.createCell(j);
				
				enteredData=sc.nextLine();
				createCell.setCellValue(enteredData);
			}
		}
		
		createExcel.write(createExcelFile);
		createExcelFile.flush();
		createExcel.close();
		
		System.out.println("Thanks to you, Data is successfully saved in File"+createFile.getName());
		
		
	
	}

}
