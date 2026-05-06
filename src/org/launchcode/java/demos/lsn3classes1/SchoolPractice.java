package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student Yichen = new Student("Li Yichen");
        ArrayList<Student> students = new ArrayList<>();

        System.out.println(Yichen.toString());

        System.out.println(Yichen);


        Student student1 = new Student("Maria", 1234);
        Student student2 = new Student("Maria", 1234);

        System.out.println(student1.getName() + ", " + student1.getStudentId() + ": " + student1);
        System.out.println(student2.getName() + ", " + student2.getStudentId() + ": " + student2);
        System.out.println(student1 == student2);

        System.out.println(student1.equals(student2));


    }
}
