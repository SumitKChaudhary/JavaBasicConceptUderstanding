/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 05-Jul-2019
 *  FILE NAME  		: 	 OverriddingTestClass.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.oopsCocept;
public class OverriddingTestClass 
{
	public static void main(String[] args) 
	{
		Overriding_ParentsClassDog refObj = new Overriding_ParentsClassDog();
		
		refObj.bark();
		
		
		Overriding_ParentsClassDog refObject= new Overriding_ChildClass();
		
		refObject.bark();
		
	}

}
