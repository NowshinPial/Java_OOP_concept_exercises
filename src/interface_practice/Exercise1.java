package interface_practice;

/**
 * Exercise 1: Basic Interface
Objective: Create a basic interface.

Create an interface called Animal with two methods:

eat()
sleep()
Create a class Dog that implements the Animal interface and provides the implementation for both eat() and sleep().
 */

interface Animal {
	void eat();
	void sleep();
}

class Dog implements Animal {
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}