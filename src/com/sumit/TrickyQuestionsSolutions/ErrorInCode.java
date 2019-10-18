/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Oct-2019
 *  FILE NAME  		: 	 ErrorInCode.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.TrickyQuestionsSolutions;
public class ErrorInCode {
	 public static void main(String[] args) {
		// quote is missing before the FOUR 

		// String s= "One"+1+2+"TWO"+"Three"+3+4+FOUR"+"Five"+5;   
		 
		 String s="One"+1+2+"TWO"+"Three"+3+4+"FOUR"+"Five"+5;
		 //BTW here the string concatenation is happening so we get the One12TWOThree34FOURFive5 on output . 
			System.out.println(s);
			
			//int i = 10++11--12++13--14++15;
	}

}
