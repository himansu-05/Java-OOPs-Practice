package p01_static_and_nonstatic_members;

public class Program02 {
    int x = 500;
    void  test(){
        System.out.println("Executing test()...");
    }
}
class Mainclass2{
    public static void main(String[] args) {
        Program02 p2 = new Program02();
        System.out.println(p2.x);
        p2.test();
    }
}

