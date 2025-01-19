package reflectionAPI;

import java.lang.reflect.Field;
import java.util.Scanner;

public class AccessngFields {

    public static void main(String[] args) throws ClassNotFoundException,
                                                NoSuchFieldException,
                                                IllegalAccessException {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter class name: ");
        String clsName = scn.nextLine();

        //Loading
        Class<?> cls = Class.forName(clsName);

        //get fields
        Field field = cls.getField("a");





    }
}