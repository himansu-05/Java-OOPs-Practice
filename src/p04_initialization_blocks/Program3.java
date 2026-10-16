package p04_initialization_blocks;

// Static Block Example 1
class Demo{
    static int i = 100;
//    Static Block
    static {
        System.out.println("SB");
        i = 100;
    }
}
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println(Demo.i);
    }
}
