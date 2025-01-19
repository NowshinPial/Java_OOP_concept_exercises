package reflectionAPI;


class C {
    static int a =m1();

    static int m1(){
        System.out.println("C SV:a");
        return 10;
    }

    int x =m2();
    int m2() {
        System.out.println("C NSV:x");
        return 20;
    }

    static{
        System.out.println("C SB");
    }

    {
        System.out.println("C NSB");
    }

    C() {
        System.out.println("C NPC");
    }

    C(int x) {
        System.out.println("C IPC");
    }

    public static void main(String[] args){
        System.out.println("C main");
    }

    static void m3(){
        System.out.println("C SM m3(np)");
    }

    static String m3(int i){
        System.out.println("C SM m3(int) " + i);
        return "abc";
    }

    void m4(){
        System.out.println("B NSM m4(np)");
    }

    float m4(String s){
        System.out.println("B NSM m4(String) "+ s);
        return 10f;
    }
}


