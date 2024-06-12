package strings;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        // ref variables may have methods
        // to use methods: varName.
        String text = "j_a_v_a_";
        text = text.toUpperCase();
        System.out.println(text.toUpperCase());
        System.out.println(text);

        System.out.println("mindtek".toLowerCase());
        int size = text.length();
        System.out.println(size);
        // return : brings back to the caller
        // caller -> code from where the method is being called

        // Structure of String variables:
        // String word = "ja va";
        //                01234
        // first index: 0
        // last index:  word.length()-1
        // text = j_a_v_a_
        //        01234567
        System.out.println(text.charAt(7));
    }
}
