package reflectionAPI;

import java.util.Scanner;

public class DynamicallyCallingClass {

    public static void main(String[] args) throws ClassNotFoundException,
                                                    InstantiationException,
                                                    IllegalAccessException{

       // System.out.println(System.getProperty("java.class.path"));

        //Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name: ");
        String clsName = sc.next();

        //Loading the class 'Class'
        Class cls = Class.forName(clsName);
        System.out.println();

        //Instantiating the class 'Class' no param
        Object obj = cls.newInstance();
        System.out.println();

        //Reading the class
        System.out.println(obj);
    }
}
