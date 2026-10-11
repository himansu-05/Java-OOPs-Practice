package p01_static_and_nonstatic_members;

public class Program03 {
    static int a = 10;
    int b = 20;
    static void test(){
        System.out.println("Executing test()...");
    }
    void display(){
        System.out.println("Executing disp()...");
    }
}

class Maincalss3{
    public static void main(String[] args) {
        Program03 p3 = new Program03();
        System.out.println(Program03.a);
        System.out.println(p3.b);
        Program03.test();
        p3.display();
    }
}


// Static members are declared using static keyword, and we can access them using className
// Non-static members are declared without using static keyword, and we can access them by creating object of the class