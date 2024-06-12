package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

    public static void main(String[] args) {

        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> list1=List.of(5,2,10,2);
        List<Integer> list2=List.of(15,2,16);

        numbers.add(list1);
        numbers.add(list2);

        /*
        Add numbers of lists into single list by multiplying each number by 2,
        and only those that is less than 10.
        {10,4,4,4}
        flatmap
        filter
        map
         */

        List<Integer> output=numbers.stream()
                .flatMap(List::stream)
                .filter(x->x<10)
                .map(x->x*2)
                .collect(Collectors.toList());

        System.out.println(output);


    }

}
