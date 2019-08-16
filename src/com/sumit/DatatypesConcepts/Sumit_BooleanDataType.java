package com.sumit.DatatypesConcepts;

public class Sumit_BooleanDataType
{
	public static int a=20, b=50;
	
	//Use the boolean keyword to declare boolean variable
	//Boolean data type is use to store only ‘boolean‘ values such as ‘true‘ and ‘false‘. To declare a Boolean variable, you can use the ‘boolean‘ keyword.
    
	public static boolean testResult;
	
	public static void main(String[] args) {

		
		if (a<b)
		{
			//Initialize the boolean variable with value true or false, 
			//once boolean declaration is done
			testResult = true;
			System.out.println("B have greater then A \n"+testResult);
		}
		else 
		{
			testResult = false;
			System.out.println("B have not greater then A"+testResult);
		}
		if (a==b)
		{
			//Initialize the boolean variable with value true or false, 
			//once boolean declaration is done
			testResult = true;
			System.out.println("B is equal to a\n"+testResult);
		}
		else 
		{
			testResult = false;
			System.out.println("B is not equal to  A\n"+testResult);
		}
		
		
	}

}
