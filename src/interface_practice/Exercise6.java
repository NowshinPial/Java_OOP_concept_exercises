package interface_practice;

/**
 * Exercise 6: Interface Variables
Objective: Understand how variables are used in interfaces.

1. Create an interface called Book with a variable:
		- int pageCount = 100; (Note: All variables in interfaces are public static final by default.)
2. Create a class Novel that implements the Book interface and print the pageCount value.
 */

interface Book{
	int pageCount=100; //variables must be instantiated in interface. 
						//All variables in interfaces are public static final by default.
}

class Novel implements Book {
	
	public static void main(String[] args) {
	System.out.println(pageCount);
	}
}