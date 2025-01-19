package OOP_concept_excercise.encapsulation;


/**Exercise 1: Create a Person Class
 1. Create a Person class with the following private fields:
 - name (String)
 - age (int)
 - address (String)
 2. Add public getter and setter methods for each field to allow controlled access to them.
 In the main method, create an instance of the Person class and set the values for name, age, and address.
 Then, print the values to make sure they are set correctly.
 *
 */

class Person {
    private String name;
    private int age;
    private String address;

    //getter and setter for name
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //getter and setter for age
    public void setAge(int age) {
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    //getter and setter for address
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
}

class Exercise1{
    public static void main(String[] args){

        Person p=new Person();

        p.setName("Sarfaraz");
        System.out.println(p.getName());

        p.setAge(8);
        System.out.println(p.getAge());

        p.setAddress("15910 Jordan Meadow Way, Hockley TX");
        System.out.println(p.getAddress());

    }
}