package com.siddharth.corejavabasics;

import com.siddharth.corejavabasics.chap1.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.setLegs(4);
		d.eat();
		d.ieat();
		d.bark();
		
		// Array of Cat Objects
		Cat [] c = new Cat[3];
		
		c[0] = new Cat();
		c[1] = new Cat();
		c[2] = new Cat();
		
		c[0].setLegs(2);
		c[0].brain = 2;
		c[0].eat();
		c[0].huntsMouse();

		c[1].setLegs(3);
		c[1].brain = 3;
		c[1].eat();
		c[1].huntsMouse();
		
		c[2].setLegs(4);
		c[2].brain = 4;
		c[2].eat();
		c[2].huntsMouse();		
		
		final int x = 20;
		
		System.out.println(x);
		
		System.out.println(c[0].brain);
		System.out.println(c[1].brain);
		System.out.println(c[2].brain);
		
		// Final variable cannot be reinitialized viz. x = 25 is not allowed;
		
		
		
		
	}

}
