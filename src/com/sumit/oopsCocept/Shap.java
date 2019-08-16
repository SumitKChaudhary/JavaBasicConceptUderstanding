/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Jul-2019
 *  FILE NAME  		: 	 Shap.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.oopsCocept;

abstract class Shap
{
	String color;
	
	//these are abstract method
	abstract double area();
	
	public abstract String toString();
	
	
	public Shap(String color)
	{
		System.out.println("Shap constructor called");
		this.color=color;
		
	}
	
	
	public String getColor()
	{
		return color;
	}
}
