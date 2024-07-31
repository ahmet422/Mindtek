package SOLID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Switchable bulb = new ClassLamb();
        Switch sw = new Switch(bulb);
        sw.flip();
        sw.flip();

        List<Integer> list = new LinkedList<>();

    }
}
