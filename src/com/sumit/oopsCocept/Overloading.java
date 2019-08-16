/*sumitkumar
11:52:10 pm
04-Jul-2019*/
/**
 * @author sumitkumar
 */

package com.sumit.oopsCocept;
public class Overloading
{
	public void add(int x)
	{
		System.out.println("Single");
	}
	public void add(int x, int y)
	{
		this.add(x);
		System.out.println("double");
	}
	public void add (int x, int y, int z)
	{
		this.add(x, y);
		System.out.println("three");
	}
	public static void main(String[] args) 
	{
		Overloading obj = new Overloading();
		
		obj.add(3, 4, 5);
		
	}

}
