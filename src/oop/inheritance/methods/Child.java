package oop.inheritance.methods;

public class Child extends Parent {

    /*
    Inherited Methods:
    1. Static method
    2. Final method
    3. Regular method

    Methods can be overridden:
    1. Regular method
     */

    public static String staticMethod(){
        return "Static Method of Child Class";
    }

    @Override
    public String regularMethod(){
        return "Regular Method of Child Class";
    }



}












