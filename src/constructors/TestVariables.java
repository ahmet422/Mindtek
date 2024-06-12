package constructors;

public class TestVariables {

    public static void main(String[] args) {

        PracticeVariables object1=new PracticeVariables();
        object1.b=10;

        PracticeVariables object2=new PracticeVariables();
        object2.a=5;
        object2.c=1;

        PracticeVariables object3=new PracticeVariables();
        PracticeVariables object4=new PracticeVariables();

        //                      0   +    5    +   1      = 6
        System.out.println(object1.a+object2.a+object1.c);
        //                      10  +    1    +    1     = 12
        System.out.println(object1.b+object2.c+object1.c);

        System.out.println(object1.c+object2.c+object3.c+object4.c);

    }

}
