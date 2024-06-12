package conditions;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // ask a user to enter a word
        // construct a new word by putting * after every letter
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word:");
        String text = input.next();
        String res = "";
        int i = 0;
        while(i < text.length()){
            res = res + text.charAt(i) + "*";
            i++;
        }
        System.out.println(res);
    }
}
