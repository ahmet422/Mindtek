package arraylist2;

import java.util.ArrayList;
import java.util.List;

public class Mindtek {

    public static void main(String[] args) {

        List<String> sdetClasses=new ArrayList<>(List.of("Java","Selenium","TestNG","Cucumber","SQL","Rest API"));
        Program program1=new Program("SDET",100,sdetClasses);

        List<String> javaClasses=new ArrayList<>(List.of("Java","Java Streams","Java Generics","Spring boot","Git","Unit Test","Clouds"));
        Program program2=new Program("Java Development",101,javaClasses);

        List<String > salesforceClasses=new ArrayList<>(List.of("Administrator, Apex, LWC, Aura, SOQL, Integration"));
        Program program3=new Program("Salasforce Development",102,salesforceClasses);

        Student student1=new Student("John Doe",1,"Chicago IL", program2);
        Student student2=new Student("Patel Harsh",2,"Austin TX",program1);
        Student student3=new Student("Kim Yan",3,"Los Angeles CA",program3);
        Student student4=new Student("Sumathi Lakka",4,"New York NY",program2);
        Student student5=new Student("Brad Pitt",5,"Miami FL",program1);

        System.out.println(student1);

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        for(Student s : students){
            System.out.println(s.getName());
        }

        System.out.println("==========");
        /*
        John Doe is attending Java Development program.
         */

        for(Student s: students){
            System.out.println(s.getName()+ " is attending "+s.getProgram().getName()+" program.");
        }

        System.out.println("===============");

        System.out.println(UtilityMethods.getStudents(students,101));
        System.out.println(UtilityMethods.getStudents(students,102));

        System.out.println("================");

        List<Program> programs=new ArrayList<>();
        programs.add(program1);
        programs.add(program2);
        programs.add(program3);

        System.out.println(UtilityMethods.getClasses(programs,"SDET"));
        System.out.println(UtilityMethods.getClasses(programs,"Java Development"));


        System.out.println("===============");

        System.out.println(UtilityMethods.getStudentIds(students,"Chicago IL"));
        System.out.println(UtilityMethods.getStudentIds(students, "Miami FL"));


    }

}
