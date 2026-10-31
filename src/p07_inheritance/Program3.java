package p07_inheritance;

//Multi Level Inheritance
class A1{
    void test(){
        System.out.println("test()....");
    }
}

class B1 extends A1{
    void disp(){
        System.out.println("disp().....");
    }
}

class C extends B1{
    void play(){
        System.out.println("play()....");
    }
}
public class Program3 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.test();
        B1 b1 = new B1();
        b1.test();
        b1.disp();
        C c1 = new C();
        c1.test();
        c1.disp();
        c1.play();
    }
}
