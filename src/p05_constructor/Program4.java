package p05_constructor;

//Zero Argument Constructor Example 2
class Beta{
    int a;
    double d;
    char c;
//    Zero Argument Constructor
    Beta(){
        a = 25;
        d = 7.4;
        c = 'A';
    }
}
public class Program4 {
    public static void main(String[] args) {
        Beta ref = new Beta();
        System.out.println(ref.a);
        System.out.println(ref.d);
        System.out.println(ref.c);
    }
}
