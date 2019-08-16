package com.sumit.PracticeAssignments;

public class LocalAndGlobalVariable 
{
	int age = 12;//Global variable 
	
	public static void main(String[] args) {
		int age = 28;//local variable 
	
		System.out.println("Print the Value from local variable\n\n"+age);
		

		//New keyword create an object for class 
		//refObj call a variable 
		LocalAndGlobalVariable refObj=new LocalAndGlobalVariable();

		
		//Syso print the global variable value we drive the value with helf of refObj 
		System.out.println("Print the Value from globale variable\n\n"+refObj.age);
		
	}

}
