/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Nov-2019
 *  FILE NAME  		: 	 GetDifferencefromTwoString.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.StringCocept;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;

public class GetDifferencefromTwoString
{
	public static int indexOfDifference(String str1, String str2) {
	      if (str1 == str2) {
	          return -1;
	      }
	      if (str1 == null || str2 == null) {
	          return 0;
	      }
	      int i;
	      for (i = 0; i < str1.length() && i < str2.length(); ++i) {
	          if (str1.charAt(i) != str2.charAt(i)) {
	              break;
	          }
	      }
	      if (i < str2.length() || i < str1.length()) {
	          return i;
	      }
	      return -1;
	  }
	public static String difference(String str1, String str2) {
	      if (str1 == null) {
	          return str2;
	      }
	      if (str2 == null) {
	          return str1;
	      }
	      int at = indexOfDifference(str1, str2);
	      if (at == -1) {
	          return "";
	      }
	      return str2.substring(at);
	  }
	public static void main(String[] args) 
	{
		String s= "Hi i'm sumit chaudhary";
		String s1= "Hi i'm sumit chaudahry";
		
		String diffData= difference(s, s1);
		System.out.println("First String Data is \t:\t"+s);
		System.out.println("Second String Data is\t:\t"+s1);
		
		System.out.println("Difference from data is\t:\t"+diffData);
		
	}
}

