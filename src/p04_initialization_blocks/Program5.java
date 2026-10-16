package p04_initialization_blocks;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("Main");
        Program5 p = new Program5();
    }
    static {
        System.out.println("Static-Block");
    }
    {
        System.out.println("Non-Static Block");
    }
}
