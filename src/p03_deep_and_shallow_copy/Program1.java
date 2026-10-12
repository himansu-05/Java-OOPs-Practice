package p03_deep_and_shallow_copy;

//Deep Copy
class Player{
    String name = "Kohli";
}
public class Program1 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.name = "Rohit";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
