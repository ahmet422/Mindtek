package oop.inheritance.constructors;

public class Sofa extends Furniture {

    String model;

    public Sofa(String model) {
        super(model);
        this.model=model;
        super.model="Super class's model";
        System.out.println("In Sofa Constructor");
    }
}
