package oop.abstraction.phones;

import java.util.ArrayList;
import java.util.List;

public class TestPhones2 {

    public static void main(String[] args) {

        // Polymorphic object
        // Reference decides what variable and methods
        // this object can call.
        Storage phone=new IPhone();

        System.out.println(phone.delete());
                        //  down casting
        System.out.println( ((Phone)phone).call() );

        Phone iPhone=new IPhone();
        Phone samsung=new Samsung();

        List<Object> phoneList=new ArrayList<>();
        phoneList.add(iPhone);
        phoneList.add(samsung);
        phoneList.add(new IPhone());
        phoneList.add(new Object());
        phoneList.add("Java");
        phoneList.add(123);
        phoneList.add(true);
        phoneList.add(new StringBuilder("Java"));

    }

}
