/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 30-Aug-2019
 *  FILE NAME  		: 	 ReadExcelFileData.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.ExcelFileHandlingApachePOI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileData
{
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File getXLSXFile = new File("../BasicCoceptUnderstading/XLSXFile_READ.xlsx");
		
		XSSFWorkbook  readExcelFile= new XSSFWorkbook(getXLSXFile);
		
		XSSFSheet getSheet = readExcelFile.getSheetAt(0);
		
		
		int rowNumber = getSheet.getPhysicalNumberOfRows();
		
		for(int i=0; i<rowNumber; i++)
		{
			XSSFRow getRow = getSheet.getRow(i);
			int sheetCell = getRow.getPhysicalNumberOfCells();
			for(int j=0; j<sheetCell; j++)
			{
				XSSFCell getCell = getRow.getCell(j);
				
				System.out.println(getCell.getStringCellValue());
			}
		}
	}

}
