package oop.inheritance.flyvehicles;

import oop.inheritance.vehicles.Bus;
import oop.inheritance.vehicles.Vehicle;

public class TestVehicles {

    public static void main(String[] args) {
        Bus bus=new Bus();
        System.out.println(bus.getInfo());

        Plane plane=new Plane();
        System.out.println(plane.getInfo());

        Vehicle vehicle=new Vehicle();
        vehicle.model="Toyota";
        // vehicle.color="White";
        // vehicle.make="Camry";
    }
}
