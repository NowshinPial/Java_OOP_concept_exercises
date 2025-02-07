package ExceptionHandling.mathProject;

/**
 * In blogic, define a method to take two integers as an argument.
 * If the arguments are positive, add those two values and return results only
 * If the arguments are negative, throw an exception with an error message.
 */
public class Blogic {

    int validate(int a, int b) {
        if(a<0 || b<0)
            throw new IllegalArgumentException("Values of 'a' and 'b' must be positive");

        return (a+b);
    }
}

