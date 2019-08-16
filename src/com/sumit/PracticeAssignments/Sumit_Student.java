package com.sumit.PracticeAssignments;

public class Sumit_Student 
{
			int age;
		int roll_no;
		
		public void Method1()
		{
			System.out.println("welcome all");
		}
		public void Method2()
		{
			System.out.println("Welcome all of you.");
			
		}
		public static void main(String[] args)
		{
			
			Sumit_Student ref1=new Sumit_Student();
			Sumit_Student ref2=new Sumit_Student();
			
			ref1.Method1();
			ref1.age = 26;
			ref1.roll_no = 123;

			System.out.println(ref1.age);
			System.out.println(ref1.roll_no);
			
			ref2.Method2();		
			ref2.age = 30;
			ref2.roll_no = 123456;

			System.out.println(ref2.age);
			System.out.println(ref2.roll_no);
			
		}

	


}
