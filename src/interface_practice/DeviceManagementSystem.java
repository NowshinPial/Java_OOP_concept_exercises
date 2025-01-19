package interface_practice;

/**
Exercise: Device Management System
You are tasked with creating a device management system using interfaces in Java. The system should include the following features:

1. Create a Device Interface:
	- Add three methods:
		-void powerOn();
		- void powerOff();
		- String getDeviceType(); (This method should return the type of device as a string.)
2. Create Two Device Types:
	- Create a class Laptop that implements the Device interface:
		- In the powerOn() method, print: "Laptop is powered on."
		- In the powerOff() method, print: "Laptop is powered off."
		- In the getDeviceType() method, return "Laptop".
	- Create a class Smartphone that implements the Device interface:
		- In the powerOn() method, print: "Smartphone is powered on."
		- In the powerOff() method, print: "Smartphone is powered off."
		- In the getDeviceType() method, return "Smartphone".
3. Create a Device Manager:
	- Create a class DeviceManager with a method manageDevice(Device device):
		- Call the powerOn() method on the device.
		- Print the device type using getDeviceType().
		- Call the powerOff() method on the device.
4. Test the System:
	- In the main method, create instances of Laptop and Smartphone.
	- Pass both objects to the manageDevice() method of DeviceManager and observe the outputs.
*/

interface Device {
	void powerOn();
	void powerOff();
	String getDeviceType();
}

class Laptop implements Device {
	
	public void powerOn() {
		System.out.println("Laptop is powered on");
	}
	
	public String getDeviceType() {
		
		return "Laptop";
	}
	public void powerOff() {
		System.out.println("Laptop is power off");
	}
	
	
}

class SmartPhone implements Device {
	
	public void powerOn() {
		System.out.println("Smartphone is powered on");
	}
	
	public String getDeviceType() {
		
		return "Smartphone";
	}

	public void powerOff() {
		System.out.println("Smartphone is power off");
	}
	
	
}

class DeviceManager {
	
	void manageDevice (Device device) {
		
		device.powerOn();
		System.out.println("Device Type: " + device.getDeviceType());
		device.powerOff();
	}
}

class DeviceManagementSystem {
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		SmartPhone sp = new SmartPhone();
		
		DeviceManager dm = new DeviceManager();
		dm.manageDevice(l);
		dm.manageDevice(sp);
	
		
	}
}