package p03_deep_and_shallow_copy;

//Shallow Copy
class Player1{
    String name = "Kohli";
}
public class Program2 {
    public static void main(String[] args) {
        Player1 p1 = new Player1();
        Player1 p2 = p1;
        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.name = "Rohit";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
