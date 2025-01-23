package objectClass.cloningMethod.shallowCloning.hkExample;


public class Test08_Objectclass_cloning {
        public static void main(String[] args) throws CloneNotSupportedException {

            Ex e1 = new Ex(0, 0);
            System.out.println(e1);
            e1.setX(15);
            e1.setY(16);
         /*   System.out.println(e1);
            System.out.println();*/

            //Rule #1: we can not call clone() in user class directly
            //it must be overridden in Ex class with public kw

           Ex e2 = e1.clone(); //Rule #2: we must handle CloneNotSupportedException

            //Rule #3: we must do type casting to assign to subtype
            //class Ex, because clone() method return type is Object
            //or we must implement co-varient returns in Ex class
            //while overriding clone() method

            /*System.out.println(e2);
            System.out.println(e1 == e2);
            System.out.println(); */

            //it is not cloning just assigning
            //copying old object reference into this new ref var
            //both variables are pointing to the same object
            Ex e3 = e1;
            System.out.println(e1 == e3);
            System.out.println();

            //after cloning modifying one of the objects
            //modification is not effected to other object
            //because both ref vars are pointing to diff objects
            e2.setX(27);
            e2.setY(28);
            System.out.println(e1);
            System.out.println(e2);
            System.out.println();

            //after assigning one ref to another ref var,
            //modification is effected to other ref var
            //because both ref vars are pointing to same object
            e3.setX(27);
            e3.setY(28);
            System.out.println(e1);
            System.out.println(e3);
            System.out.println();

            //shallow cloning
            Sa s1 = new Sa();
            s1.setX(15);
            s1.setS(new String("abc"));
            s1.setIa(new int[] {3, 4, 5});
            s1.setE1(new Ex(24, 25));
            System.out.println(s1);

            //in shallow cloning only instance variables memory is copied
            //but not their pointing internal Has-A relation object
            //then the new object after cloning is also pointing the same
            //old has-a relation objects memory

            Sa s2 = s1.clone();
            System.out.println(s2);
            System.out.println(s1 == s2);

           System.out.println(s1.getX() == s2.getX());
           System.out.println(s1.getS() == s2.getS());
           System.out.println(s1.getIa() == s2.getIa());
           System.out.println(s1.getE1() == s2.getE1());

            //modifying has-a relation objects data by using one object
            //then modification is effected to both objects, both are pointing to
            //same has-a relation object
            s2.getIa()[0] = 8;
            s2.getIa()[1] = 9;
            s2.getIa()[2] = 10;
            System.out.println(s1);
            System.out.println(s2);
            System.out.println();

            //deep cloning
            Pq pq1 = new Pq();
            pq1.setX(15);
            pq1.setS(new String("abc"));
            pq1.setIa(new int[] {3, 4, 5});
            pq1.setE1(new Ex(24, 25));
            System.out.println(pq1);

            Pq pq2 = pq1.clone();
            System.out.println(pq2);
            System.out.println(pq1 == pq2);
            System.out.println(pq1.getX() == pq2.getX());
            System.out.println(pq1.getS() == pq2.getS());
            System.out.println(pq1.getIa() == pq2.getIa());
            System.out.println(pq1.getE1() == pq2.getE1());

            //modifying has-a relation objects data
            //them modification is effected to both objects
            pq2.getIa()[0] = 8;
            pq2.getIa()[1] = 9;
            pq2.getIa()[2] = 10;
            System.out.println(pq1);
            System.out.println(pq2);
            System.out.println();

        }
    }

