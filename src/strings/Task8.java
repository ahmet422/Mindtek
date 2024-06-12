package strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // find the total amount of vowel letters in a given word
        // ask a user to enter a word with a length of 5
        // if length is not 5 do nothing but print invalid word
        // if length is 5, then print total amount of vowel letters in a given word
        // vowel: a, e, i , o ,u
        Scanner input = new Scanner(System.in);
        System.out.println("Word with length 5: ");
        String word = input.next().toLowerCase();
        if(word.length()==5) {
            int count = 0;
            int index = 0;
            char letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') count++;

            System.out.println(count + " vowels found");
            System.out.println(5-count + " non vowels found");
        }else System.out.println("Invalid length");
    }
}
