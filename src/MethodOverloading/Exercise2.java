package MethodOverloading;


/**
 * Write a Printer class with a method print() that can print an integer, a double, and a string. Use method overloading to achieve this.
 */

class Printer {

    void print(int a){
        System.out.println("I am printing integers");
    }

    void print(double b){
        System.out.println("I am printing double");
    }

    void print(String s){
        System.out.println("I am printing a String");
    }
}

public class Exercise2 {
    public static void main(String[] args){
        Printer p = new Printer();
        p.print(3);
        p.print(3.4);
        p.print("HI");
    }
}
