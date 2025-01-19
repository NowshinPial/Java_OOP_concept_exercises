package MethodOverriding;


/**
 * Create a superclass Vehicle with a method move(). Override this method in a subclass Car to provide a specific implementation.
 */

class Vehicle {

    void move(){
        System.out.println("Vehcile moving");
    }

}
class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("Car is moving");
    }
}

public class Exercise1 {
    public static void main(String[] args){
        Vehicle v = new Car();
        v.move(); //we will still get Car is moving even though we created variable of Vahicle type, because we are overriding
                    //the superclass move() with the subclass move()

        Car c = new Car();
        c.move();
    }
}
