package MethodOverloading;

/**
 * Create a class Shape with a method area() that calculates the area of a square (takes one parameter).
 * Overload the method to calculate the area of a rectangle (two parameters) and a circle (one double parameter).
 */

class Shape {

    void area(int side){
        int squareArea = side*side;
        System.out.println("Area of Square is: " + squareArea);
    }

    void area(double length, double width) {
        double rectangleArea = length*width;
        System.out.println("Area of the rectangle is: " + rectangleArea);
    }

    void area(double radius){
        final double PI = 3.14;
        double circleArea =PI*radius ;
        System.out.println("Area of the Circle is: " + circleArea);
    }
}

public class Exercise1 {
    public static void main(String[] args){
        Shape s= new Shape();
        s.area(5);
        s.area(4.2, 7.5);
        s.area(2.4);
    }
}
