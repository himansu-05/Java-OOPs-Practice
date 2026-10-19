package p05_constructor;

// Parameterized Constructor Example 1
class  Container{
    int capacity;
//    User Defined Constructor - Parameterized Constructor
    Container(int arg){
        capacity = arg;
    }
}
public class Program5 {
    public static void main(String[] args) {
        Container c1 = new Container(500);
        System.out.println(c1.capacity);
        Container c2 = new Container(600);
        System.out.println(c2.capacity);
        Container c3 = new Container(700);
        System.out.println(c3.capacity);
    }
}
