package MethodOverloading;

/**
 * Design a Calculator class that has overloaded multiply() methods for multiplying two integers, three integers, and two doubles.
 */

class Calculator {

    void multiply(int a, int b){
        int multi=a*b;
        System.out.println(multi);
    }

    void multiply(int a, int b, int c){
        int multi=a*b*c;
        System.out.println(multi);
    }

    void multiply(double a, double b){
        double multi=a*b;
        System.out.println(multi);

    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.multiply(5, 6);
        c.multiply(8,9,10);
        c.multiply(2.25, 9.36);

    }
}
