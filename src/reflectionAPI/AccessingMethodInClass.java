package reflectionAPI;

import java.lang.reflect.Method;
import java.util.Scanner;

public class AccessingMethodInClass {
    @SuppressWarnings("deprecation") //annotation for removing waring for deprecation of newInstance
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className = sc.nextLine();

        //loading the class
        Class<?> cls = Class.forName(className);

        //Instantiating the class
        Object obj = cls.newInstance();

        //getting the method without parameter
        Method method = cls.getDeclaredMethod("m3");

        //to invoke method without parameter
        System.out.println(method.invoke(obj));

        //getting method with parameter
        Method method2 = cls.getDeclaredMethod("m3", int.class);

        //invoking method
        method2.invoke(obj,50);
    }
}
