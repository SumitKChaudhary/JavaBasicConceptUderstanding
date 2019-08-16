package com.sumit.interviewPractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sumit_AgeCalculator 
{
	public static void main(String[] args) 
	{
		   //Set a format to print the fetched date
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd");  
		   //fetched the current system date
		   LocalDate now = LocalDate.now();  
		   System.out.println("Current Date is\t\t:\t"+dtf.format(now));  
		
		   System.out.println("Enter Your birth of Date");
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Year \t:\t");
		   int year = sc.nextInt();  // Store entered year
		 
		   
		   System.out.print("Enter month \t:\t");
		   String month = sc.nextLine(); // store the enterd month
		   
		   // check the entered month is Upper case or not
		   //Upper case required becose Java have Month enum and is storing only UPPERCASE value
		   if(month.equals(month.toLowerCase())) 
		   {
			  String upMo= month.toUpperCase();// convert the string lower to upper
			   
			   Month.valueOf(upMo);
		   }
		   else
		   {
			  Month.valueOf(month);
		   }
		   
		   System.out.print("Enter Date \t:\t");
		   int date = sc.nextInt();//store date
		   
		   //Store the entered date by user
		   LocalDate bod = LocalDate.of(year, Month.JUNE, 17);
		   
		   //Java have Period class which return the period between to date so i'm using for this
		   Period p = Period.between(bod, now);
		   
		   System.out.println("\nYour current Age is \n");
		   
		   System.out.println("Years\t\t"+p.getYears()+"\nMonth\t\t"+p.getMonths()+"\nDays\t\t"+p.getDays());
			
	
		
		
	}

}
