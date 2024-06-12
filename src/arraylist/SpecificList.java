package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecificList {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(16);
        list.add(24);
        list.add(33);

        // Print sum of odd numbers
        int sum=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==1) sum+=list.get(i);
        }
        System.out.println("Sum of odd numbers: "+sum);

        list.add(10);
        System.out.println(list);

        // Sorting the list - ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }

}
