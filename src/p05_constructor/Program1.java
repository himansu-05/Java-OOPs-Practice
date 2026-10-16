package p05_constructor;

//Default constructor program 1
//Default constructor created by the compiler
class  Demo{
    int val = 10;
    void  test(){
        System.out.println("Executing test()...");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Demo ref = new Demo();
        System.out.println(ref.val);
        ref.test();
    }
}
