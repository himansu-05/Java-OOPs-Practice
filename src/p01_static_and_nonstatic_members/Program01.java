package p01_static_and_nonstatic_members;

public class Program01 {
    static int a = 100;
    static void  test(){
        System.out.println("Executing test()...");
    }
}

class Mainclass1 {
    public static void main(String[] args) {
        System.out.println(Program01.a);
        Program01.test();
    }
}

