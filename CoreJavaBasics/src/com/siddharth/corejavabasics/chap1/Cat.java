package com.siddharth.corejavabasics.chap1;

public class Cat extends Animal implements IAnimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this+" drinks milk");
		
		
		
	}
	
	@Override
	public void ieat() {
		// TODO Auto-generated method stub
		System.out.println(this+" drinks milk");
		
	}
	
	@Override
	public String toString() {
		return "Cat has "+getLegs()+" legs";
	}
	
	public void huntsMouse()
	{
		System.out.println(this+" catches mouse");
	}

}
