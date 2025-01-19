package reflectionAPI;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class AccessingDeclaredConstructors {

    public static void main(String[] args) throws ClassNotFoundException,
                                                     InstantiationException,
                                                         IllegalAccessException,
                                                            NoSuchMethodException{
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the class name: ");
        String className = scn.nextLine();

        //loading
        Class<?> cls = Class.forName(className);

        //Accessing constructor
        Constructor<?> cons = cls.getDeclaredConstructor(String.class);

        //printing
        System.out.println(cons);
    }
}
