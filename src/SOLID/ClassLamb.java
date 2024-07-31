package SOLID;

public class ClassLamb extends AbstractBulb implements Switchable{
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Class Light is ON now!");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Class Light is OFF now!");

    }
}
