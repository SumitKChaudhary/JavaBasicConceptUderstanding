package com.sumit.PracticeAssignments;

public class Pyramid 
{
	public static int i,j, row=5;
	public static String a="#";
	
	
	public static void main(String[] args) {	
		
		System.out.println("1 to 5 accending ornder pyramid\n");
		for (i=1;i<=row;++i)
		{
			for ( j=1;j<=i;++j)
			{
				System.out.print(j);
				/* it print 
				1
				12
				123
				1234
				12345*/
			}
			System.out.println();		
		}
		System.out.println();	
		System.out.println("Print a variable value\n");
		for (i=1;i<=row;++i)
		{
			for ( j=1;j<=i;++j)
			{
				
				System.out.print(a);
				/* it print 
				#
				##
				###
				####
				#####
				*/
			}
			System.out.println();		
		}
		System.out.println();	
		System.out.println("1 to 5 accending ornder pyramid but diffently\n");
		for (i=1;i<=row;++i)
		{
			for ( j=1;j<=i;++j)
			{
			
				System.out.print(i);
				/* it print 
				1
				22
				333
				4444
				55555*/
			}
			System.out.println();		
		}
		System.out.println();	
		System.out.println("5 to 1 decending ornder pyramid\n ");
		
		for (i=row;i>=1;--i)
		{
			for ( j=1;j<=i;++j)
			{
				
				System.out.print(j);
				/* it print 
				12345
				1234
				123
				12
				1*/
			}
			System.out.println();		
		}
			
	}
	

}
