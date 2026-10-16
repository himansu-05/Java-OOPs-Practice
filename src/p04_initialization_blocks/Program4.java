package p04_initialization_blocks;

// Static Block Example 2
class Demo1{
    static int i = 100;
    //    Static Block 1
    static {
        System.out.println("SB");
        i = 100;
    }
    //    Static Block 2
    static {
        System.out.println("SB2");
        i = 150;
    }
}
public class Program4 {
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println(Demo1.i);
    }
}
