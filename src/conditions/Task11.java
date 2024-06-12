package conditions;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // print all triplets of a give string in separate line
        int index = 0;
        if(text.length()<3) System.out.println(text);

        while(index < text.length()-2){
            System.out.println("" + text.charAt(index) + text.charAt(index+1) + text.charAt(index+2));
            index++;
        }
    }
}
