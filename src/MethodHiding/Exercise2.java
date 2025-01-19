package MethodHiding;

/**
 * Write a superclass Parent with a static method showMessage().
 * Create a subclass Child and hide the method. Use the class name to call the method directly.
 */

class Parent{

    static void showMessage(){
        System.out.println("Parent class is showing message");
    }
}

class Child extends Parent {

    static void showMessage() {
        System.out.println("Child class is showing message");
    }
}

public class Exercise2 {
    public static void main(String[] args){
        Parent.showMessage();
        Child.showMessage();

        Parent p = new Parent();
        p.showMessage();

        Child c = new Child();
        c.showMessage();
    }
}
