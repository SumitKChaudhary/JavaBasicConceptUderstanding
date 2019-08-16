/*	Author  :	Sumit kumar
 * 	Class	:   Swapping two number with and without using third variable in
 * 	Date	:	24 March 2019  
 * */
package com.sumit.interviewPractice;
import java.util.Scanner;
public class Sumit_SwapTwono {
	int a=0, b=0;
	String enterValue="Enter two number for swapping";
	String beforSwap= "Entered value before swap";
	String afterSwap= "Entered value after swap ";
	Scanner sc=new Scanner(System.in);
	 
	public void storEnteredValue(){
		System.out.println(enterValue);	
		a=sc.nextInt();  b=sc.nextInt();
		System.out.println(beforSwap+"\n"+a+"\n"+b+"\n");
	}
	public void with_Third_Variable(){
		//Main logic for swap tow number using third temp variable
		
		int tempVariable=a; 		// a transfer his value to tempVariable and now tempVariable have a's vaule
		a=b;  						//B transfer his value to A then A have b's value  
		b=tempVariable;  			// temVariable have already  A's value then transfer to B
		
		System.out.println("Number after swap with using third varibale \n");
		System.out.println("A's value is =  "+a+"\n"+"B's Value is =  "+b+"\n");
		
	}
	
	public void without_Third_Variable(){
		a=a+b;		
		b=a-b;
		a=a-b;
		
		System.out.println("Number after swap without using third varibale \n");		
		System.out.println("A's value is =  "+a+"\n"+"B's Value is =  "+b+"n");
		}
	public static void main(String[] args) 	{
		Sumit_SwapTwono obj=new Sumit_SwapTwono();
		obj.storEnteredValue();
		//System.out.println(obj);
		obj.with_Third_Variable();
		System.out.println(obj);
		
		obj.without_Third_Variable();
		obj.storEnteredValue();
		//System.out.println(obj);
		//System.out.println(obj);
	}

}
