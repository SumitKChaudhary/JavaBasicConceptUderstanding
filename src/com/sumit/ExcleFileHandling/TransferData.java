/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 30-Aug-2019
 *  FILE NAME  		: 	 TransferData.java
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
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TransferData 
{
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File getFile = new File("../BasicCoceptUnderstading/File4ReadData.xls"); 
		
		Workbook readExcelFile =Workbook.getWorkbook(getFile);
		
		Sheet  getSheet = readExcelFile.getSheet(0);
		
		File createFile = new File("../BasicCoceptUnderstading/WriteReadedData.xls");
		
		WritableWorkbook copyReadedData = Workbook.createWorkbook(createFile);
		
		WritableSheet writeDataSheet = copyReadedData.createSheet("File4ReadData_Data", 0);
		
		String getSheetReadedData = null; 
		
		int rawNumber = getSheet.getRows();
		int colNumber = getSheet.getColumns();
		
		for(int i=0; i<rawNumber;i++)
		{
			for(int j=0; j<colNumber; j++)
			{
				Cell getCell = getSheet.getCell(j, i);
				getSheetReadedData = getCell.getContents();
				Label addLable = new Label(j,i, getSheetReadedData);
				writeDataSheet.addCell(addLable);
			}
		}
		
		copyReadedData.write();
		copyReadedData.close();
		
		System.out.println("Read from        :  "+getFile.getName()+ "\nCopy success to  :   " +createFile.getName());
		
	}

}
