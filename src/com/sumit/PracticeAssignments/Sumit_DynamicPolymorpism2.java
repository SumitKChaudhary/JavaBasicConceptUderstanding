package com.sumit.PracticeAssignments;

public class Sumit_DynamicPolymorpism2 extends Sumit_DynamicPolymorpism1
{
	public void arithmetic(int a, int b)
	{
		super.arithmetic(20, 10);
		int c;
		c=a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Sumit_DynamicPolymorpism2 obj = new Sumit_DynamicPolymorpism2();
		
		obj.arithmetic(10, 5);
	}

}
