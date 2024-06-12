package conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // print every letter in a single new line
        int index = 0;
        while(index<text.length()){
            System.out.println(text.charAt(index));
            index++;
        }
    }
}
