/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Jul-2019
 *  FILE NAME  		: 	 Rectangle.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.oopsCocept;
class Rectangle extends Shap
{
	double length;
	double width;
	
	public Rectangle (String color, double length, double width)
	{
		super(color);
		System.out.println("Rectangle cunstructor called");
		this.length=length;
		this.width=width;
	}
	/* (non-Javadoc)
	 * @see com.sumit.oopsCocept.Shap#area()
	 */
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	/* (non-Javadoc)
	 * @see com.sumit.oopsCocept.Shap#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is" + super.color+"and area is "+area();
	}
}