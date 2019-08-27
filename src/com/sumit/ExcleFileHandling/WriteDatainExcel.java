/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Aug-2019
 *  FILE NAME  		: 	 WriteDatainExcel.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.ExcleFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDatainExcel 
{
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		File createFile = new File("../BasicCoceptUnderstading/writeData.xls");
		
		WritableWorkbook createWorkbook =Workbook.createWorkbook(createFile);
		
		WritableSheet createSheet = createWorkbook.createSheet("my sheet", 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column numbers");
		
		int comumnNumber=sc.nextInt();
		int rawNumber=sc.nextInt();
		System.out.println("Enter the data ");
		
		
		for(int i=0; i<comumnNumber; i++)
		{
			for (int j=0; j<rawNumber; j++)
			{
				String enteredData=sc.nextLine();
				Label label = new Label(j,i, enteredData);
				createSheet.addCell(label);
			}
		}
		
		createWorkbook.write();
		createWorkbook.close();
		
	}

}
