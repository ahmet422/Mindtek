package oop.polymorphism;

public class Methods {

    protected void printName(){
        System.out.println("John Doe");
    }

    public static String getName(){
        return "John Doe";
    }


    public static void main(String[] args) {
//        printName();
        System.out.println(getName());
    }

}
