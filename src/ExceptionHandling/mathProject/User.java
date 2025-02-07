package ExceptionHandling.mathProject;

import java.util.Scanner;

public class User {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        Blogic b = new Blogic();
        try {
            System.out.println("Enter the value for a and b");
           System.out.println(b.validate(scn.nextInt(), scn.nextInt()));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
