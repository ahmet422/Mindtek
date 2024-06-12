package conditions;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word:");
        String word = input.next();
        // print total amount of vowels and non-novels
        int vowCounter = 0;
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            boolean isVowel = letter == 'a' || letter == 'e'
                    || letter == 'o' || letter == 'u'
                    || letter == 'i';
            if(isVowel) vowCounter++;
        }

        System.out.println("Vow: " + vowCounter);
        System.out.println("Non vow: " + (word.length()-vowCounter));
    }
}
