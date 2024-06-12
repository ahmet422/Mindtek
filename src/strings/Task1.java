package strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ask a user to enter a word with length of 3 -> son, mom, hey, bro, sis
        // count how many letter a in total in a given word
        // son -> Total sum of letter a in - son is 0
        // ham -> Total sum of letter a in - ham is 1
        // aka -> Total sum of letter a in - aka is 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word with length of 3");
        String word = input.next();
        if(word.length()==3){
            int count = 0;
            //  char letter = word.charAt(0);
            if(word.charAt(0)=='a') count++;
            if(word.charAt(1)=='a') count++;
            if(word.charAt(2)=='a') count++;

            System.out.println("Total sum of letter a in - " + word + " is " + count);
        }else System.out.println("Invalid length, we asked you to enter strictly 3 length word");
    }
}
