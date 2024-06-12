package conditions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // find total amount of vowel letters from given string
        int index = 0;
        int count = 0;
        while(index<text.length()){
            System.out.println("-----------------");
            System.out.println("Checking letter: " + text.charAt(index) + " located at index: " + index);
            char letter = text.charAt(index);
            if(letter == 'a' || letter == 'e' || letter=='u' || letter=='o' || letter=='i') {
                System.out.println("Found one vowel. Incrementing the count now.");
                count++;
                System.out.println("The count is: " + count);
            }else System.out.println("Not a vowel");
            index++;
            System.out.println("*****************");
        }

        System.out.println("Total amount of vowels: " + count);
    }
}
