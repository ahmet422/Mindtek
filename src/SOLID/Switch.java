package SOLID;

public class Switch {
    Switchable switchable;

    public Switch(Switchable switchable){
        this.switchable = switchable;
    }

    public void flip(){
        if(switchable.isOn()) switchable.turnOff();
        else switchable.turnOn();
    }
}
