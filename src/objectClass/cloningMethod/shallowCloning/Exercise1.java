package objectClass.cloningMethod.shallowCloning;

/**
 * Clone a Simple Class with Primitive and Object Fields
 *
 * 1. Create a Person class with the following fields:
 *      - name (String)
 *      - age (int)
 *      - address (an object of an Address class that has street and city as its fields)
 * 2. Implement shallow cloning for the Person class.
 * 3. Create an instance of Person, clone it, and modify the address of the cloned object.
 * 4. Observe how changes in the cloned object’s address affect the original object.
 */

 class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Person implements Cloneable {
    private String name;
    private int age;
    Address address;

    //Setters and Getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int age(){
        return age;
    }
    public void setAddress(Address address){
        this.address= address;
    }
    public Address getAddress(){
        return address;
    }

    //clone() for setting clone as public, and to handle exception
    @Override
    public Person clone() throws CloneNotSupportedException {
    //    try {
        return (Person)super.clone();
  //  }catch(CloneNotSupportedException e) {
   //         throw new RuntimeException(e);
        }

}

class Exercise1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Address a = new Address("105 heathcote", "Stafford");

        //setting value for p1
        p1.setName("Nowshin");
        p1.setAge(34);
        p1.setAddress(a);

        //cloning object p1
        Person p2 = p1.clone();

        System.out.println(p1 == p2);

        p2.setName("Sarfaraz");
        p2.setAge(8);
        p2.address.city = "Hockley";
        p2.address.street = "15910 Jordan Meadow";

        System.out.println(p1 == p2);
        System.out.println(p1.address.city == p2.address.city);
        System.out.println(p1.address.street == p2.address.street);

    }
}