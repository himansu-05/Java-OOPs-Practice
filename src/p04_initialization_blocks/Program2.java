package p04_initialization_blocks;

//Non-Static Block Example2
class Honda{
    String model;
    double price;
//    Non-Static Block 1
    {
        model = "Civic";
        price = 7500000;
    }
//    Non-Static Block 2
    {
        model = "City";
        price = 1400000;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Honda h1 = new Honda();
        System.out.println(h1.model);
        System.out.println(h1.price);
    }
}
