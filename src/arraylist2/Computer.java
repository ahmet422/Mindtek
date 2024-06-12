package arraylist2;

public class Computer {

    private String brand;
    private int RAM;
    static int numberOfButtons;

    static{
        numberOfButtons=100;
        System.out.println("In static block");
    }

    {
        System.out.println("In Instance block");
    }

    public Computer(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
        System.out.println("In Constructor");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
