package objects;

public class Classroom {

    public static void main(String[] args) {

        Student student1=new Student();

        student1.name="Ahmed";
        student1.id=101;
        student1.location="Ohio";

        Student student2=new Student();

        student2.name="Galina";
        student2.id=102;
        student2.location="Florida";

        Student student3=new Student();

        student3.name="Ejegyz";
        student3.id=103;
        student3.location="Illinois";

        System.out.println(student1.study());
        System.out.println(student3.study());
        System.out.println(student2.attendingClass());

        Student[] students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name);
            System.out.println(students[i].location);
        }

    }

}
