package MethodOverriding;

/**
 * Design a superclass Animal with a method eat().
 * Override this method in subclasses Dog and Cat to define their eating behaviors.
 */

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    @Override
    void eat(){
        System.out.println("Dog is eating");

    }

    void bark(){
        System.out.println("Dog is barking");
    }

}
class Cat extends Animal {

    @Override
    void eat(){
        System.out.println("Cat is eating");
    }
}

public class Exercise3 {

    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        a.sleep();

        Animal b = new Cat();
        b.eat();

        Animal c = new Animal();
        c.eat();


    }
}
