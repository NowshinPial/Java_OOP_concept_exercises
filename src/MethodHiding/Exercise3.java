package MethodHiding;

/**
 * Define a Library class with a static method getInfo().
 * Create a subclass DigitalLibrary that hides the getInfo() method. Test calling the method with different class names.
 */

class Library {

    static void getInfo (){
        System.out.println("Library Info");
    }
}

class DigitalLibrary extends Library {

    static void getInfor () {
        System.out.println("Digital Library Info");
    }
}


public class Exercise3 {
    public static void main(String[] args) {
        Library.getInfo();
        DigitalLibrary.getInfor();

        Library l = new DigitalLibrary();
        l.getInfo();

        Library m = new Library();
        m.getInfo();

        DigitalLibrary dl = new DigitalLibrary();
        dl.getInfo();
    }
}
