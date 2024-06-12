package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        List<String> colors=List.of("Red","Blue","White","Black","Green","Pink");

        Stream<String> stream = colors.stream();

        Stream<String> sortedColors = stream
                .filter(color -> color.startsWith("B")) // Blue, Black
                .sorted(); // Black, Blue

        List<String> output = sortedColors.filter(color -> color.contains("a")) // Stream<String>
                .collect(Collectors.toList()); // List<String>

        System.out.println(output);


        List<Integer> lengths = colors.stream()
                .map(color -> color.length())
                .collect(Collectors.toList());

        System.out.println(lengths);

        boolean result = colors.stream()
                .filter(x -> x.length()==5) // "White","Black","Green"
                .anyMatch(x -> x.toLowerCase().contains("b"));

        System.out.println(result);

        // List.of("Red","Blue","White","Black","Green","Pink");

        boolean result2 = colors.stream()
                .filter(x -> x.length()==4) // Blue, Pink
                .noneMatch(x-> x.toLowerCase().contains("q"));

        System.out.println(result2);

         Integer max =colors.stream()
                .map( x -> x.length() )
                .max(Integer::compareTo).get();

        System.out.println("Maximum length: "+max);

        Integer min= colors.stream()
                .map(String::length)
                .min((x,y) -> x.compareTo(y)).get();

        System.out.println("Minimum length: "+min);

        colors.stream()
                .forEach(System.out::println);

    }

}
