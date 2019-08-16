package com.sumit.PracticeAssignments;

/* @author					:		Sumit Kumar Chaudhary
 * Class Name				:		Sumit_checkStringPalindrome
 * class for				:		This class find the string palindrome or not
 * 
 * Defination the palindrome	:		
 * Palindrome in Java: Java program to check if a string is a palindrome or not.A string is a palindrome if it remains unchanged when 
 * reversed, for example, "dad" is a palindrome as reverse of "dad" is "dad" whereas "program" isn't a palindrome as its reverse is 
 * “margorp” which is different from "program". Some examples of palindrome strings are "mom", "madam", "abcba", “12321”, "c++&++c". 
 * 	In our program a user will input a string and we create a new string which will be its reverse and then we compare it
 * 	with the input string.
 * */

import java.util.*;

public class Sumit_checkStringPalindrome
{
   public static void main(String args[])
   {
	   //orignal is a string type variable which store the user entered valued. 
	   //reverse is also string type variable but its store the original variable value 
      String original, reverse = ""; // Objects of String class
      
      //Scanner is a java class. The class is available in java.util package.  
      Scanner scn = new Scanner(System.in);
     
      System.out.println("Enter a string to check if it is a palindrome");
      
      original = scn.nextLine();
     
      // this method find the lenght of entered value. 
      int length = original.length();

	  System.out.println("Lenght of the entered stringis\n\n"+length);
	  
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
      //Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
      //The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
      
         //equal method compare the two variable's value. 
      if (original.equals(reverse))
         System.out.println("The string is a palindrome because is reverse value is\n\n"+reverse);
      else
         System.out.println("The string isn't a palindrome because is reverse value is \n\n"+reverse);
         
   }
} 
