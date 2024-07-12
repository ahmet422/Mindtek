package collections;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();
        // key and value pairs are stored
        // keys must be unique
        // initial capacity of map is 16 buckets
        // map uses hashcode method - x and divides with 16 , uses remainder to determine a bucket
        // where this is going to be stored
        // hash collision: when in one single bucket many objects are stored
        // equals method is used to find correct object from a bucket
        // till 8 objects hashmap utilizes linked list to store objects, for 8+ situation it utilizes
        // binary tree, because binary tree is much efficient that linked list

        // add elements
        days.put(3,"Wednesday");
        days.put(22,"Tuesday");
        days.put(7,"Sunday");
        days.put(5,"Friday");
        System.out.println(days.put(33,"Friday"));;
        days.put(null,"sssss");
        // get elements
        System.out.println(days.get(5));;
        // remove
        System.out.println(days.remove(77));;
        System.out.println(days.getOrDefault(700,"Seven"));;
        System.out.println(days.putIfAbsent(22,"Twelve"));
        System.out.println(days);

        // iterate through map:
        for(Map.Entry<Integer,String> pair : days.entrySet()){
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
            System.out.println("-----");
        }

        System.out.println("*****************");
        days.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
