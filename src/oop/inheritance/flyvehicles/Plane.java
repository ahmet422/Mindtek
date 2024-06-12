package oop.inheritance.flyvehicles;

import oop.inheritance.vehicles.Vehicle;

public class Plane extends Vehicle {

    public String getInfo(){
        String info="Model: "+model+", Color: "+color;
        return info;
    }

}
