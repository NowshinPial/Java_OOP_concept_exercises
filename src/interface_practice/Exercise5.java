package interface_practice;

/**
**Exercise 5: Interface Inheritance
Objective: Understand how interfaces can inherit from other interfaces.

1. Create an interface called ElectricDevice with a method:
	- void powerOn();
2. Create another interface called WashingMachine that extends ElectricDevice and adds a method:
	- void startWash();
3. Create a class LGWashingMachine that implements WashingMachine and provides implementations for powerOn() and startWash()
**/

interface ElectricDevice {
	
	void powerOn();
}

interface WashingMachine extends ElectricDevice { //to create relationship between interface to interface, we use "extends" kw
	void startWash();
}

class LGWashingMachine implements WashingMachine { //to crete relationship between interface to class, we use "implements"
	
	public void powerOn() {
		System.out.println("The power is on");
	}
	
	public void startWash() {
		System.out.println("The washing started");
	}
	
}