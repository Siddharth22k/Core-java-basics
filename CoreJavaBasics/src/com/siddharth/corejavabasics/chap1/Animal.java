package com.siddharth.corejavabasics.chap1;

public abstract class Animal 
{
	private int legs;  //Private type is Visible only in this class
	
	protected String type; //Protected type is Visible in package level and also outside package level if Inherited
	
	boolean tail; // Default type is Visible only in package level
	
	public static int brain = 1; // Static variables are Only One per class rest all above variables are Class Variables 
	// Class variables are allotted separate per object

	
	// public specifiers are visible everywhere
	
	public int getLegs() { 
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public abstract void eat();
	
}
