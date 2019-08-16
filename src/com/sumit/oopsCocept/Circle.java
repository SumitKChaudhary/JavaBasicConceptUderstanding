/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Jul-2019
 *  FILE NAME  		: 	 Circle.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.oopsCocept;
class Circle extends Shap
{
	double redius; 
	
	public Circle(String color, double redius)
	{
		super(color);
		System.out.println("Circle cunstructor called");
		
		this.redius=redius;
	}

	/* (non-Javadoc)
	 * @see com.sumit.oopsCocept.Shap#area()
	 */
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(redius, 2);
	}

	/* (non-Javadoc)
	 * @see com.sumit.oopsCocept.Shap#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circule color is "+super.color+"and area is :"+area();
	}
}
