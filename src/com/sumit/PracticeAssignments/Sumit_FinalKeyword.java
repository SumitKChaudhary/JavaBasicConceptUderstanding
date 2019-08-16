package com.sumit.PracticeAssignments;

public class Sumit_FinalKeyword
{
	public static float x=50.5F; // F is define the value as a float 
	
	public final static float y= 25.5F;
	
	public static void main(String[] args) {
		
		Sumit_FinalKeyword refVariable=new Sumit_FinalKeyword();
		
		refVariable.x=100.50F;// here be can change easily the value of x because we not define the x is a final 
		
		//refVariable.y=50.5F; // Here we can change the value of y but we can't because we declare as a final 
							// And front of this swing use error
		
		System.out.println(x+y);
		
		
	}

}
