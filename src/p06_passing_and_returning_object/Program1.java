package p06_passing_and_returning_object;

import java.util.Scanner;

class Student{
    int id;
    double cgpa;
    Student(int id, double cgpa){
        this.id = id;
        this.cgpa = cgpa;
    }
}
class StudentHelper{
    void studentDetails(Student s){
        if (s != null){
            System.out.println("ID : " + s.id);
            System.out.println("CGPA : " + s.cgpa);
        }
    }

    Student createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        System.out.println("Enter CGPA");
        double cgpa = sc.nextDouble();
        Student s = new Student(id, cgpa);
        return s;
    }
}

public class Program1{
    public static void main(String[] args) {
        StudentHelper studentHelper = new StudentHelper();
        Student s1 = studentHelper.createStudent();
        studentHelper.studentDetails(s1);
    }
}

