package MethodHiding;

/**
 * Create a superclass Bird with a static method fly().
 * Create a subclass Parrot that hides the fly() method with its own static implementation.
 * Check which method is called using different references.
 */

class Bird{

    static void fly(){
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird {

    static void fly() {
        System.out.println("Parrot is flying");
    }
}

public class Exercise1 {
    public static void main(String[] args){
        Bird b = new Parrot();
        b.fly();

        Parrot p = new Parrot();
        p.fly();

        Bird bird = new Bird();
        bird.fly();
    }

}
