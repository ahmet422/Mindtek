package oop.polymorphism.student;

public class StaticPolymorphism {

    public static int getSum(int num1, int num2){
        return num1+num2;
    }

    public static int getSum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {

        // STATIC POLYMORPHISM - Method Overloading
        /*
        It executes same method at runtime that
        it points at compile time.
         */

        System.out.println(getSum(2,3));
        System.out.println(getSum(3,4,5));

    }

}
