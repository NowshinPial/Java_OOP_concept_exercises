package objectClass.cloningMethod.shallowCloning.hkExample;

//Rule #4: this class must implement Cloneable interface
//for cloning or for calling clone() on this class objects
public class Ex implements Cloneable {

    private int x;
    private int y;

    public Ex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Ex clone() throws CloneNotSupportedException {
        return (Ex)super.clone();
    }

    @Override
    public String toString() {
        return "Ex("+x+", "+y +")";
    }
    //Rule #3
    public static void main(String[] args) throws CloneNotSupportedException {
        Ex e1 = new Ex(10, 20);
        //Ex e2 = e1.clone();	//Rule #1:  Rule #2
        Ex e2 = (Ex)e1.clone();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 == e2);


    }
}