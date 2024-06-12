package conditions;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // find if the text is a palindrome?
        int index = text.length()-1;
        String rev = "";
        // reverse
        while(index>=0) {
            rev = rev + text.charAt(index);
            index--;
        }

        // check if equals
        if(text.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
