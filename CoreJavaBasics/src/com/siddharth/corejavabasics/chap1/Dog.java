package com.siddharth.corejavabasics.chap1;

public class Dog extends Animal implements IAnimal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println(this+" is eating");
		
		
		
	}
	
	@Override
	public void ieat() {
		// TODO Auto-generated method stub

		System.out.println(this+" is eating");

	}
	
	@Override
	public String toString() {
		
		return "Dog has "+getLegs()+" legs,";
	}
	
	public void bark()
	{
		System.out.println(this+" barking");
	}
	
	

}
