package objectClass;

/**
 * Level 1: Easy
 * Exercise 1: Override toString()
 * 1. Create a class Book with fields title and author.
 * 2. Override the toString() method to return a string like: "Book[title=BookTitle, author=AuthorName]".
 * 3. Create a Book object, print it, and see the output.
 */

public class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book[Book Title="+title+", Author Name="+author+"]";
    }

    public static void main(String[] args){
        Book book = new Book("Harry Potter", "JK Rowling");
        System.out.println(book);
    }

}
