package interface_practice;

/**
 * Exercise 2: Using Interface in a Class
Objective: Implement an interface in a class.

Create an interface called Appliance with these methods:

turnOn()
turnOff()
Create a class Fan that implements the Appliance interface. In the Fan class, provide implementations for turnOn() and turnOff().
 * */

interface Appliance {
	void turnOn();
	void turnOff();
}

class Fan implements Appliance {
	
	public void turnOn() {
		System.out.println("The fan is on");
		
	}
	
	public void turnOff() {
		System.out.println("The fan is off");
	}
}