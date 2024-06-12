package oop.abstraction.flyobjects;

public class TestBirds {

    public static void main(String[] args) {

//        Interfaces can NOT be instantiated (create object)
//        Flyable flyable=new Flyable();

        Eagle eagle=new Eagle();

        System.out.println(eagle.fly());
        System.out.println(eagle.makeNoise());

        System.out.println(eagle.WINGS);
        System.out.println(eagle.LEVEL);
        System.out.println(eagle.TAILS);

    }

}
