package objectClass.hkAssignment;

import java.util.HashSet;

public class Test_Employee {

    public static void main(String[] args){

        Employee e1 = new Employee(123, "Sarfaraz", "Grade 2", 10000);
        Employee e2 = new Employee(456, "Afreen", "Kinder Garten", 5000);
        Employee e3 = new Employee(789, "Nowshin", "Java", 12500);

    //Printing hascode
        System.out.println("e1 object's hashcode"+e1.hashCode());
        System.out.println("e2 object's hashcode"+e2.hashCode());
        System.out.println("e3 object's hashcode"+e3.hashCode());

        //printing equal
        System.out.println("are e1 and e2 object same?: "+e1.equals(e2));
        System.out.println("are e1 and e2 object same?: "+e2.equals(e3));

        //printing object state
        System.out.println("e1 objects data: "+ e1);
        System.out.println("e1 objects data: "+ e2);
        System.out.println("e1 objects data: "+ e3);

        //collection code
        HashSet<Employee> hs = new HashSet<>();
        hs.add(new Employee(101, "E1", "CJ", 10000)); //e1.hC()
        hs.add(new Employee(101, "E1", "CJ", 10000)); //e2.hC(), e2.eq(e1), not stored
        hs.add(new Employee(101, "E1", "AJ", 10000)); //e3.hC()
        hs.add(new Employee(101, "E1", "Or", 10000)); //e4.hC()
        hs.add(new Employee(102, "E1", "CJ", 10000)); //e5.hC(), e5.eq(e1), stored
        hs.add(new Employee(102, "E1", "AJ", 10000)); //e6.hC(), e6.eq(e3), stored
        hs.add(new Employee(102, "E1", "Or", 10000)); //e7.hC(), e7.eq(e4), stored

        System.out.println(hs); //toString

    }
}
