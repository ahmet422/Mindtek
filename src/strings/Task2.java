package strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // ask a user to enter any word
        // if the first and the last characters are the same:
        // then print : "First and last chars are same"
        // otherwise print: "First and last chars are different"
        // hello -> "First and last chars are different"
        // mom -> "First and last chars are same"
        Scanner in = new Scanner(System.in);
        System.out.println("Any word:");
        String word = in.nextLine();
        System.out.println(word);
        if(word.charAt(0) == word.charAt(word.length()-1)) System.out.println("First and last chars are same");
        else System.out.println("First and last chars are different");
    }
}
