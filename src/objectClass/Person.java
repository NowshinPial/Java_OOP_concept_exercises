package objectClass;

import java.util.Objects;

/**
 * Exercise 3: Override equals() and hashCode()
 * 1. Create a class Person with fields name and age.
 * 2. Override the equals() method to compare Person objects based on name and age.
 * 3. Override the hashCode() method to return a hash based on these fields.
 * 4. Test it:
 *      - Create two Person objects with the same name and age.
 *      - Check if they are equal using equals().
 *      - Print their hash codes and verify they are the same.
 */
public class Person {
   String name;
   int age;

    Person(String name, int age) {
        this.name= name;
        this.age= age;
        System.out.println("I am a person");
    }

    //Override the equals() method to compare Person objects based on name and age
    @Override
    public boolean equals(Object obj){
        Person p=(Person)obj;
        return (name.equals(p.name)) && (age == p.age);
    }

    //Override the hashCode() method to return a hash based on the fields
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

    public static void main(String[] args){
        Person p1 = new Person("Nowshin", 33);
        Person p2 = new Person("Sarfaraz", 8);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
