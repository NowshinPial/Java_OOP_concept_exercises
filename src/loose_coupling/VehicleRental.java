package loose_coupling;

/*
*Problem: Vehicle Rental System
You are tasked with designing a Vehicle Rental System using Java that manages various types of vehicles 
and allows users to rent them. The system should be flexible to handle different types of vehicles like cars and bikes.

Requirements:
1. Design a base class to represent any type of vehicle.
2. Each vehicle should have attributes like:
		- A unique identifier
		- Model name
		- Rental price per day
		- Availability status
3. Specific types of vehicles (e.g., cars, bikes) may have unique attributes:
		- Cars: Include the number of seats.
		- Bikes: Include the engine capacity (in cc).
4. The system must allow users to:
		- Add new vehicles to the rental system.
		- Rent a vehicle if it is available.
		- Return a rented vehicle.
		- Display details of all available vehicles.
5. Renting or returning an unavailable/available vehicle should display appropriate messages.
*/

interface Vehicle {
	
	void ID();
	String ModelName();
	void RentalPrice(double price);
	void AvailabilityStatus();
}

class Car implements Vehicle {
	  private int seats; // Specific attribute for Car
	  private boolean isAvailable;
	  
	public Car(int seats) {
	        this.seats = seats;
	        this.isAvailable = true;  // Assume car is available initially
	    }

	
	@Override
	public void ID() {
		System.out.println("This is a car");
	}
	
	@Override
	public String ModelName() {
		return "Toyota";
	}
	
	@Override
	public void RentalPrice(double price) {
		
		System.out.println("Price of the car is $" + price + " per day.");
	}
	
	@Override
	public void AvailabilityStatus() {
		if(isAvailable) {
		System.out.println("Status: Available");
	}else {
		System.out.println("Status: Not Available");
	}
}
	// Method to change the availability status
    public void rentCar() {
        isAvailable = false;
        System.out.println("Car rented successfully.");
    }
    
    public void returnCar() {
        isAvailable = true;
        System.out.println("Car returned successfully.");
    }
    
}

class Bike implements Vehicle {
	private boolean isAvailable;
	
	public Bike() {
		this.isAvailable = true;
	}

	@Override
	public void ID() {
		System.out.println("This is a bike");
	}
	
	@Override
	public String ModelName() {
		return "Honda";
	}
	
	@Override
	public void RentalPrice(double price) {
		
		System.out.println("Price of the bike is $" + price + " per day.");
	}
	
	@Override
	public void AvailabilityStatus() {
		if(isAvailable) {
	
		System.out.println("Status: Available");
	}else {
		System.out.println("Status: Not Available");
	}
	}
	
	 // Method to change the availability status
    public void rentBike() {
        isAvailable = false;
        System.out.println("Bike rented successfully.");
    }

    public void returnBike() {
        isAvailable = true;
        System.out.println("Bike returned successfully.");
    }
}

class RentalManagement {
	
	void rentalStatus (Vehicle vehicle, double price) {
		
		vehicle.ID();
		System.out.println("Model: " + vehicle.ModelName());
		vehicle.RentalPrice(price);
		vehicle.AvailabilityStatus();
	}
		
		 // Additional methods to handle renting and returning
	    void rentVehicle(Vehicle vehicle) {
	        if (vehicle instanceof Car) {
	            ((Car) vehicle).rentCar();
	        } else if (vehicle instanceof Bike) {
	            ((Bike) vehicle).rentBike();
	        }
	    }

	    void returnVehicle(Vehicle vehicle) {
	        if (vehicle instanceof Car) {
	            ((Car) vehicle).returnCar();
	        } else if (vehicle instanceof Bike) {
	            ((Bike) vehicle).returnBike();
	        }
		
	}
}

class VehicleRental {
	
	public static void main (String[] args) {
		
		Car car = new Car(4);
		Bike bike = new Bike();
		
		RentalManagement rm = new RentalManagement();
		
		rm.rentalStatus(car, 5000.55);
		rm.rentalStatus(bike, 280.56);
		
		// Display vehicle details again after rental status change
        System.out.println("\nAfter Renting:");
        rm.rentalStatus(car, 5000.55);
        rm.rentalStatus(bike, 280.56);

        // Return the vehicles
        rm.returnVehicle(car);
        rm.returnVehicle(bike);

        // Display vehicle details after returning
        System.out.println("\nAfter Returning:");
        rm.rentalStatus(car, 5000.55);
        rm.rentalStatus(bike, 280.56);
	}
}



