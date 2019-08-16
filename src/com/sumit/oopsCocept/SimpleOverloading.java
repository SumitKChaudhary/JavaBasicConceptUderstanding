/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 05-Jul-2019
 *  FILE NAME  		: 	 SimpleOverloading.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.oopsCocept;
public class SimpleOverloading
{
	public void add (int x , int y)
	{
		int c= x+y;
		System.out.println("Both integer addition output\t:\t"+c);
	}
	public void add (int x , float y)
	{
		float c= x+y;
		System.out.println("Integer and Float value output\t:\t"+c);
	}
	public void add (String st1, String st2 )
	{
		String st3= null; 
		System.out.println("After Concate the both string value \t:\t"+(st3 = st1.concat(" "+st2)));
	}
	
	public void bark(){
        System.out.println("woof1 ");
    }
 
    //overloading method
    public void bark(int num){
        for(int i=0; i<num; i++)
        {
            System.out.println("woof ");
        }
    }

	
	public static void main(String[] args) 
	{
		SimpleOverloading obj = new SimpleOverloading();
		
		obj.add(3, 5);
		
		obj.add(3, 5.5f);
		
		obj.add("Sumit", "Kumar");
		obj.bark(3);
	}
	

}
