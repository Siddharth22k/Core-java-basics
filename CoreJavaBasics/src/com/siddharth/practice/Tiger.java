package com.siddharth.practice;

public class Tiger extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this+" is eating ");
	}
	
	@Override 
	public String toString() {
		return "Tiger has "+getLegs()+" legs";
	}
	public void roar() {
		System.out.println(" Roars");
	}
	
}
