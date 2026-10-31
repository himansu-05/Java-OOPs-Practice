package p07_inheritance;

//Single Level Inheritance
class A{
    void test(){
        System.out.println("test()....");
    }
}

class B extends A{
    void disp(){
        System.out.println("disp()....");
    }
}
public class Program2 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.test();
        B b1 = new B();
        b1.test();
        b1.disp();
    }
}
