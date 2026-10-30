package p07_inheritance;


// Inheritance
class  Delta{
    void play(){
        System.out.println("Executing play().....");
    }
}

class Example extends Delta{
    void start(){
        System.out.println("Executing start().....");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Example example = new Example();
        example.play();
        example.start();
        Delta delta = new Delta();
        delta.play();
//        delta.start(); can not access start method because inheritance is unidirectional
    }
}
