package conditions;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // find out if text has identical neighbor pairs
        int i = 0;
        boolean identicalFound = false;
        while(i < text.length()-1){
            if(text.charAt(i) == text.charAt(i+1)) {
                identicalFound = true;
                System.out.println("Compairing pair: " + text.charAt(i) + text.charAt(i+1) + " is identical: " + identicalFound);
                System.out.println("Found");
                break; // escape the loop
            }
            System.out.println("Compairing pair: " + text.charAt(i) + text.charAt(i+1) + " is identical: " + identicalFound);
            i++;
        }

        if(identicalFound) System.out.println("Identical pair found");
        else System.out.println("No identical pair found");
    }
}
