package oop.polymorphism.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

    public static void main(String[] args) {

        // Polymorphic Object
        // Reference type (Student) decides what variables and methods
        // can be called.
        Student student1=new OnlineStudent();
        Student student2=new OfflineStudent();

        System.out.println(student1.study());
        System.out.println(student2.study());

                        //      down casting
        System.out.println( ((OnlineStudent)student1).doHomework() );

        // DYNAMIC POLYMORPHISM - Method Overriding
        /*
        Method point to different at compile time,
        but it runs overridden method at runtime.
         */
        System.out.println(student1.study());

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(new OnlineStudent());
        students.add(new OfflineStudent());

        OnlineStudent student3=new OnlineStudent();
        System.out.println(getSchool(student3));

        OfflineStudent student4=new OfflineStudent();
        System.out.println(getSchool(student4));

        System.out.println(getSchool(student1));
        System.out.println(getSchool(student2));
//        System.out.println(getSchool("Java"));
//        System.out.println(getSchool(123));

        Student student6=new OfflineStudent();

        System.out.println( ((OnlineStudent)student6).doHomework());

    }

    public static int getSchool(Student student){
        return student.hashCode();
    }

}
