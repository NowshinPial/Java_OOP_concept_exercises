package objectClass.cloningMethod;
 //Rule #4: this class must implement Cloneable interface
    //for cloning or for calling clone() on this class objects
    public class cloningExample implements Cloneable {

        private int x;
        private int y;

        public cloningExample(int x, int y) {
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
        public cloningExample clone() throws CloneNotSupportedException { //we also override for changing accessiblity modifier
            return (cloningExample)super.clone();
        }

        @Override
        public String toString() {
            return "Ex("+x+", "+y +")";
        }
        //Rule #3
        public static void main(String[] args) throws CloneNotSupportedException {
            cloningExample e1 = new cloningExample(10, 20);
            //Ex e2 = e1.clone();	//Rule #1:  Rule #2
            cloningExample e2 = (cloningExample)e1.clone();

            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e1 == e2);


        }
    }
