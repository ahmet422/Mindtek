package SOLID;

public class DecorBulb extends AbstractBulb implements Switchable {

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Decor Light is ON now!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Decor Light is OFF now!");
    }

}
