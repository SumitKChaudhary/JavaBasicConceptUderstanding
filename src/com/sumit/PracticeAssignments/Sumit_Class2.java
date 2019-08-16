package com.sumit.PracticeAssignments;



public class Sumit_Class2 
{
	//Class 2 
	public static void main(String[] args) 
	{
		//Call a static variable from another class. 
		
		System.out.println(Sumit_Class1.name+"\n");
		System.out.println(Sumit_Class1.mobNumber+"\n");
		System.out.println(Sumit_Class1.sallery+"\n");
		
		
		// You must be run the class 2
		
		// call the return type method from the class 1 
		// new keyword is create a variable for class1 
		Sumit_Class1 refVariable = new Sumit_Class1();
		
		int sum_Result=refVariable.sum(10, 2);
	    
		// sum_Result is type cast of int type that help to 
		// drived the class1 methods easly
		
		System.out.println("Class 1 method Result\n"+sum_Result);
		
		Sumit_Class1.sub();
		
	}
	

}
