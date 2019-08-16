package com.sumit.interviewPractice;

/*@author 	;	Sumit Kumar Chaudhary
 * Program	:	Student Marksheet
 * Date		:	21 April 2019
 * */

import java.util.Scanner;
public class Sumit_Student_MarkSheet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sub1= "Hindi", sub2="English", sub3="Math", sub4="Science", sub5="Drawing";
		
		System.out.println("\n Welcome To MarkSheet Calculation");
		
		System.out.print("Enter the name of student \t:\t");		
		String name = sc.next();
		
		System.out.print("Enter the Roll Number \t\t:\t");		
		String roll_No = sc.next();
		
		System.out.print("Enter the College Name\t\t:\t");		
		String col_Name = sc.next();
		
		System.out.print("Enter the number for "+sub1+"\t:\t");
		int s1=sc.nextInt();
		
		System.out.print("Enter the number for "+sub2+"\t:\t");
		int s2=sc.nextInt();
		
		System.out.print("Enter the number for "+sub3+"\t:\t");
		int s3=sc.nextInt();
		
		System.out.print("Enter the number for "+sub4+"\t:\t");
		int s4=sc.nextInt();
		
		System.out.print("Enter the number for "+sub5+"\t:\t");
		int s5=sc.nextInt();
		
		int total;
		float percentage ;
		
		total=s1+s2+s3+s4+s5;
		
		percentage=total/5;
		
		System.out.print("\n\n\t Marksheet ");
		
		System.out.print("\n-------------------------------------------------------");
		System.out.print("\n\tStudent Name \t:\t"+name);
		System.out.print("\n\tRoll Number  \t:\t"+roll_No);
		System.out.print("\n\tCollege Name \t:\t"+col_Name);
		System.out.print("\n-------------------------------------------------------");
		System.out.print("\n\t Subject\t\t Marks");
		System.out.print("\n\t"+sub1+"\t\t:\t"+s1);
		System.out.print("\n\t"+sub2+"\t\t:\t"+s2);
		System.out.print("\n\t"+sub3+"\t\t:\t"+s3);
		System.out.print("\n\t"+sub4+"\t\t:\t"+s4);
		System.out.print("\n\t"+sub5+"\t\t:\t"+s5);
		System.out.print("\n-------------------------------------------------------");
		System.out.print("\n\tTotal marks\t\t:\t"+total);
		System.out.print("\n\tMarks Percentage%3d\t:\t"+percentage);
		
		
		if(percentage>=60)
		{
			System.out.print("\n\tDivision\t\t:\tFirst");
		}
		else if ((percentage>=40)&&(percentage<=60))
				{
					System.out.print("\n\tDivision\t\t:\tSecond");
				}
		else if ((percentage>=25)&&(percentage<=40))
		{
			System.out.print("\n\tDivision\t\t:\tThired");
		}
		else
		{
			System.out.print("\n\tBest Of next time\t:\tSorry you are fail this year please try again. Best of luck");
		}
		
	}

}