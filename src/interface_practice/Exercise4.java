package interface_practice;

/**
 * *Exercise 4: Static Method in an Interface
Objective: Learn how to create and use static methods in interfaces.

1. Create an interface Smartphone with a static method:
		- static void showBrand() { System.out.println("Brand: XYZ"); }
2. Create a class Phone that implements the Smartphone interface. Call the showBrand() method inside Phone.


 * **/

interface Smartphone1 {
	static void showWBrand() {
		System.out.println("Brand: XYZ");  //since java8 static methods and default methods can have body inside interface
	}
}

