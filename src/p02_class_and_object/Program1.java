package p02_class_and_object;

// class
class Student{
    String name;     // value based property / data member
    double cgpa;     // value based property / data member
    // action based properties / member functions
    void listen(){
        System.out.println("Listening..");
    }
    void write(){
        System.out.println("Writing...");
    }
}
public class Program1 {
    public static void main(String[] args) {
//        object creation using new keyword
        Student s1 = new Student();
        s1.name = "Rama";
        System.out.println(s1.name);
        s1.cgpa = 8.7;
        System.out.println(s1.cgpa);
        s1.listen();
        s1.write();

//        2nd object
        Student s2 = new Student();
        s2.name = "Sita";
        System.out.println(s2.name);
        s2.cgpa = 9.6;
        System.out.println(s2.cgpa);
        s2.listen();
        s2.write();
    }
}
