/**sumitkumar
 StringUpperCaseCompare.java
 * 14-Jun-2019
 */
package com.sumit.interviewPractice;

/**
 * @author sumitkumar
 *
 */
public class StringUpperCaseCompare 
{
	  
	  public static void main(String args[])
	  {
		  String s1 = "sumit";
		  String s2 = "SUMIT";
		  
		  String s3 = new String("SUMIT");
		  
		  System.out.println("First  : "+(s1.toUpperCase()==s2));
		  
		  System.out.println("Second : "+(s1.toUpperCase().equals(s2)));
		  
		  
		  System.out.println("Thired : "+(s1.toUpperCase()==s3));
		  
		  System.out.println("Fourth : "+(s1.toUpperCase().equals(s3)));
		  
		  
		  
		  
		  
	  }
	   


}
