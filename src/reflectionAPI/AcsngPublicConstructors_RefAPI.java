package reflectionAPI;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class AcsngPublicConstructors_RefAPI {

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the class name: ");
        String className = scn.nextLine();

        //Loading class
        Class cls = Class.forName(className);

        /*//Instantiating
        Object obj = cls.newInstance();*/

        //Calling public cosntructors
        Constructor<?>[] cons = cls.getConstructors();

        //printing all constructors
        for(Constructor<?> con : cons){
            System.out.println(con);
        }
    }
}
