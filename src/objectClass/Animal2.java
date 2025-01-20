package objectClass;

/**
 * Exercise 2: Use getClass()
 * Create a class Animal and create an object of it.
 * Use the getClass() method to print the name of the object's class.
 */

public class Animal2 {

    Animal2() {
        System.out.println("I am an animal");
    }

    public static void main(String[] args) {
        Animal2 animal = new Animal2();

        System.out.println(animal.getClass());
    }
}
