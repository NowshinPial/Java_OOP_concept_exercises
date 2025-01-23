package objectClass.cloningMethod.shallowCloning.hkExample;

//class to its members with instance variables
//is HAS-A relation

import java.util.Arrays;

public class Pq implements Cloneable {

    //HAS-A relation
    private int x;
    private String s;
    private int[] ia;
    private Ex e1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int[] getIa() {
        return ia;
    }

    public void setIa(int[] ia) {
        this.ia = ia;
    }

    public Ex getE1() {
        return e1;
    }

    public void setE1(Ex e1) {
        this.e1 = e1;
    }

    @Override
    public Pq clone() throws CloneNotSupportedException {

        //shallowing cloning (only ref vars cloned)
        Pq pq = (Pq)super.clone();

        //deep cloning, cloning internal has-a relation objects also
        pq.s = new String(this.s); //String does not cloning, hence creating new String object
        pq.ia = this.ia.clone();
        pq.e1 = this.e1.clone();

        return pq;


    }

    @Override
    public String toString() {
        return "Sa(" + x + ", " + s + ", " + Arrays.toString(ia) + ", " + e1 + ")";
    }

}