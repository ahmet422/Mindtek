package designpatterns;

import javax.swing.*;

public class Logging {
    private static Logging obj = new Logging();
    // no one can call this constructor
    private Logging(){}

    public static Logging getInstance(){
        return obj;
    }
    public void log(String text){
        System.out.println(text);
    }
}
