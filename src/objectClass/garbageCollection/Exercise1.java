package objectClass.garbageCollection;

/**
 * Exercise 1: Basic Object Reference
 * 1. Create an object and assign it to a variable.
 * 2. Reassign the variable to another object.
 * 3. Make the variable null and identify which objects are eligible for garbage collection.
 */

public class Exercise1 {
    public  void main(String[] args) throws InterruptedException{

        A a = new A();
        A a1 = new A();

        a = a1;
        a = null;

        System.gc();

        Thread.sleep(1000);
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println(this + " object is finalized");
    }
}
