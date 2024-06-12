package oop.inheritance.vehicles;

public class Vehicle {

    public String model;
    protected String color;
    String make;
    private int year;

    public String drive(){
        System.out.println(park());
        return "Vehicle is driving";
    }

    protected String stop(){
        return "Vehicle is stopping";
    }

    String start(){
        return "Vehicle is starting";
    }

    private String park(){
        return "Vehicle is parking";
    }


}
