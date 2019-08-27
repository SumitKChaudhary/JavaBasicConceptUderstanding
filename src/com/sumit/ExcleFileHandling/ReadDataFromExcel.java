/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 25-Aug-2019
 *  FILE NAME  		: 	 ReadDataFromExcel.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.ExcleFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel
{
	public static void main(String[] args) throws BiffException, IOException {
		
		File connectFile = new File("../BasicCoceptUnderstading/readData.xls");
		
		Workbook getworkbook =Workbook.getWorkbook(connectFile);
		
		Sheet getSheet =getworkbook.getSheet(0);
		
		
		int raw = getSheet.getRows() ;
		int column = getSheet.getColumns();
		
		for(int i=0; i<raw; i++)
		{
			for(int j=0; j<column; j++)
			{
				Cell getCell = getSheet.getCell(j,i);
				System.out.println(getCell.getContents());
			}
		}	
	}
	

}
