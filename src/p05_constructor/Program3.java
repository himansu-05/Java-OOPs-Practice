package p05_constructor;

//Zero Argument Constructor Example 1
class Alpha{
    int x;
    void play(){
        System.out.println("Executing play()...");
    }
//    User Defined Constructor - Zero Argument Constructor
    Alpha(){
        System.out.println("Alpha() constructor");
        x = 100;
    }
}
public class Program3 {
    public static void main(String[] args) {
        Alpha ref = new Alpha();
        System.out.println(ref.x);
        ref.play();
    }
}
