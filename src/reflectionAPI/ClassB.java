package reflectionAPI;

class B {
    static int a =m1();

    static int m1(){
        System.out.println("B SV:a");
        return 10;
    }

    int x =m2();
    int m2() {
        System.out.println("A NSV:x");
        return 20;
    }

    static{
        System.out.println("B SB");
    }

    {
        System.out.println("B NSB");
    }

    B() {
        System.out.println("B NPC");
    }

    B(int x) {
        System.out.println("B IPC");
    }

    public static void main(String[] args){
        System.out.println("B main");
    }

    static void m3(){
        System.out.println("B SM m3(np)");
    }

    static String m3(int i){
        System.out.println("B SM m3(int) " + i);
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


