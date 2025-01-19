package reflectionAPI;

//Use below class 'A' for running above test class with above
//three cases

class A {
    public String test="I am a public field";
    private String test2="I am a private field";
    static int a =m1();

    static int m1(){
        System.out.println("A SV:a");
        return 10;
    }

    int x =m2();
    int m2() {
        System.out.println("A NSV:x");
        return 20;
    }

	static{
            System.out.println("A SB");
    }

	{
            System.out.println("A NSB");
    }

    A() {
    System.out.println("A NPC");
    }

    A(int x) {
    System.out.println("A IPC");
    }

public static void main(String[] args){
    System.out.println("A main");
}

static void m3(){
    System.out.println("A SM m3(np)");
}

static String m3(int i){
    System.out.println("A SM m3(int) " + i);
    return "abc";
}

void m4(){
    System.out.println("A NSM m4(np)");
}

float m4(String s){
    System.out.println("A NSM m4(String) "+ s);
    return 10f;
}
}

