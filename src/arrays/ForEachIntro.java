package arrays;

import java.util.Arrays;

public class ForEachIntro {
    public static void main(String[] args) {
        char[] symbols = {'A','A','h','u','t','g'};

//       for(int i = 0; i < symbols.length; i++) {
//           symbols[i] = 'P';
//       }
//        System.out.println(Arrays.toString(symbols));
        // char el : symbols -> el represents each value from symbols array
        int i = 0;
        for(char el : symbols) System.out.println(el);
        System.out.println(Arrays.toString(symbols));
    }
}
