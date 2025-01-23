package objectClass.cloningMethod.shallowCloning;

/**\
 * 1. Create a Book class with the following attributes:
 *  - title (String)
 *  - author (String)
 * 2. Implement the clone() method to perform a shallow copy.
 * 3. Create an object of the Book class, clone it, and modify the cloned object’s attributes.
 *     Observe how the original object behaves.
 */
public class Book implements Cloneable { //class implementing clone ()
    Title title;
   private String author;

    //Setters and getters
    public void setTitle(Title title){
        this.title = title;
    }
    public Title getTitle(){
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    //Shallow clone Override
    public Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }

    //Overriding to String method
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }


}


