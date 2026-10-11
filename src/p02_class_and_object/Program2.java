package p02_class_and_object;

class Mobile {
    String name;
    double price;
    void call(){
        System.out.println("Calling in " + name);
        System.out.println("Its price is " + price);
    }
    void message (){
        System.out.println("Calling in " + name);
        System.out.println("Its price is " + price);
    }
}
public class Program2 {
    public static void main(String[] args) {
       Mobile m1 = new Mobile();
       m1.name = "Iphone 17 pro Max";
       m1.price = 1.4;
       m1.call();
       m1.message();
       Mobile m2 = new Mobile();
       m2.name = "S26 Ultra";
       m2.price = 1.2;
       m2.call();
       m2.message();
    }
}
