package multithreading;

public class NumberPrinter extends Thread {
    public NumberPrinter(String name) {
        super(name);
    }

    public void run(){
        for(int i = 0; i < 5; i++) System.out.println(this.getName() + i);
    }

}
