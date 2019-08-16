/**sumitkumar
 Sumit_SwitchCondition.java
 * 02-Apr-2019
 */
package com.sumit.Conditions;

import java.util.Scanner;

/**
 * @author sumitkumar
 *
 */
public class Sumit_SwitchCondition
{
	public static void main(String[] args) {
		System.out.println("Please enter tow number");
		
		int a,b ,c=0;
		
		Scanner sc =new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		char operator =sc.next().charAt(0);// when we want to take operator input from user
		
		//String operator =sc.Next();	
		
		//in case operator variable is string type then operator sign should in double cutes 
		
		//char operator ='+'; // here define the operator value
		
		switch(operator)  
		{
		case '+':  // match the operator variable value and run the define calculation
			c=a+b;
			break; // break is used for exit from the case
		case '-':
			c=a-b;
			break;
		case '*':
			c=a*b;
			break;
		case '/':
			c=a/b;
			break;
		default: 
		System.out.println("Please enter correct operator ");
		
		}
		System.out.println("Value is "+c);
		
		
	}

}
