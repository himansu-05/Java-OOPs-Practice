package p05_constructor;

class Student{
    String name;
    double cgpa;
    int yop;

//    User Defined Constructor - Parameterized Constructor
    public Student(String name, double cgpa, int yop) {
        this.name = name;
        this.cgpa = cgpa;
        this.yop = yop;
    }
}

public class Program6 {
    public static void main(String[] args) {
        Student s1 = new Student("Rama", 8.5, 2026);
        System.out.println("Name : " + s1.name);
        System.out.println("CGPA :" + s1.cgpa);
        System.out.println("YOP : " + s1.yop);

        Student s2 = new Student("Sita", 9.4, 2026);
        System.out.println("Name : " + s2.name);
        System.out.println("CGPA :" + s2.cgpa);
        System.out.println("YOP : " + s2.yop);
    }
}
