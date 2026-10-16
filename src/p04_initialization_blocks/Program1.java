package p04_initialization_blocks;

//Non-static Block Example1
class Employee{
    String name;
    String company;
    double salary;
//    Non_static Block
    {
        name = "Rahul";
        company = "Wipro";
        salary = 45000;
    }

}
public class Program1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1.name + " " + e1.company + " " + e1.salary);
        System.out.println(e2.name + " " + e2.company + " " + e2.salary);
    }
}
