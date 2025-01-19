package interface_practice;

/**
*Exercise 3: Default Method in an Interface
Objective: Understand and use a default method in an interface.

1. Create an interface called Vehicle with a default method:
		- default void startEngine() { System.out.println("Engine started"); }
2. Create a class Car that implements the Vehicle interface. You do not need to implement startEngine() because it's already provided in the interface.
**/


interface Vehicle {
	default void startEngine() {
		System.out.println("Engine started");   //default methods inside interface have body
	}
}

class Car implements Vehicle {
	
	//do not need to implement default startEngine, because it is already provided in the interface.
}