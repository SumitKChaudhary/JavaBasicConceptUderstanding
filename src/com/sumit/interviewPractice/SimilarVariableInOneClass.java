/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 20-Sep-2019
 *  FILE NAME  		: 	 SimilarVariableInOneClass.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;
public class SimilarVariableInOneClass
{
	int a = 10 ;
	
	String str = "http://dev";
	
	public void method1(int a, String str) {
		
		System.out.println(a);
		System.out.println(str);
		
	}
	public void method2(int a, String str) {
		System.out.println(a);
		System.out.println(str+".docquity.com/");
		
	}
	
	public void method3() {
		System.out.println(a);
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		
		SimilarVariableInOneClass obj = new SimilarVariableInOneClass();
		
		obj.method1(1, "sumit");
		obj.method2(23, "rakesh");
		obj.method3();
		
		//System.out.println(obj);
	}

}
