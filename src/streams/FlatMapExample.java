package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<Integer>> listOfList=new ArrayList<>();

        List<Integer> list1=List.of(4,5,1);
        List<Integer> list2=List.of(3,2);

        listOfList.add(list1);
        listOfList.add(list2);

        List<Integer> numbers = listOfList.stream()
                .flatMap(list -> list.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numbers);

        List<Integer> numbers2=new ArrayList<>();

        listOfList.stream()
                .forEach(x-> x.stream().forEach(num -> numbers2.add(num)));

        System.out.println(numbers2);

        String[] values={"Today, I have", "learned streams","and different operations"};
        // String[] values={"Today,", "I", "have", "learned", "streams","and", "different", "operations"};

        List<String> words=Arrays.stream(values)
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());

        // "Today, I have" -> {"Today,","I","have"} -> array of String
        //element.split(",") -> array of String
        // array of String -> Stream of String {"Today,","I","have"}

        System.out.println(words);




    }

}
