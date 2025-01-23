package objectClass.cloningMethod.shallowCloning;

public class ShallowCloningBook{

    public static void main (String[] args) throws CloneNotSupportedException {


        Book b1 = new Book(); //modified book
        Title t = new Title("The rise of phoenix");

        //b1.setTitle(new String ("Harry Potter"));
        b1.setAuthor("JK Rowling");
        b1.setTitle(t);
        System.out.println(b1);

        //Clone the book
        Book b2 = b1.clone();
        System.out.println(b1 == b2); //expected false
        System.out.println(b1.getTitle() == b2.getTitle()); //expected true
        System.out.println(b1.getAuthor() == b2.getAuthor()); //expected true
        System.out.println("Title: "+b1.getTitle()+"\nAuthor: "+b1.getAuthor());
        System.out.println("Title: "+b2.getTitle()+"\nAuthor: "+b2.getAuthor());

        //for adding space in the result
        System.out.println();

        //modifying the object
        b2.setAuthor(new String ("abc"));
        b2.title.titleName= "The rise of whatever";
        System.out.println(b1 == b2); //expected false
        System.out.println(b1.getTitle() == b2.getTitle()); //expected true
        System.out.println(b1.getAuthor() == b2.getAuthor()); //expected false
        System.out.println("Title: "+b1.getTitle()+"\nAuthor: "+b1.getAuthor());
        System.out.println("Title: "+b2.getTitle()+"\nAuthor: "+b2.getAuthor());


    }
}
