package p07_inheritance;


// Hierarchical Inheritance
class A2{
    void test(){
        System.out.println("test()...");
    }
}

class B2 extends A2{
    void disp(){
        System.out.println("disp()...");
    }
}

class C1 extends A2{
    void play(){
        System.out.println("play()...");
    }
}
public class Program4 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.test();
        B2 b = new B2();
        b.test();
        b.disp();
        C1 c = new C1();
        c.test();
        c.play();
    }

}

// Other two forms of the inheritance is illegal in java which are multiple inheritance and hybrid inheritance
// In multiple inheritance one subclass acquiring properties from more than one superclass
// In java it causes jacobs diamond ambiguity in which subclass don't know from which super class it should acquire the properties of object class
// as object class is the super most class of every class in java
// But we can overcome from this problem using interface.
// Same for hybrid inheritance as it is a combination of one or more inheritance
