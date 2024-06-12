package oop.abstraction.phones;

import java.util.List;

public class TestPhones {

    public static void main(String[] args) {

        IPhone iPhone=new IPhone();
        Samsung samsung=new Samsung();

        System.out.println(iPhone.call());
        System.out.println(CloudStorage.CLOUDMEMORY);

        System.out.println(samsung.text());

        String name;


    }

}
