package conditions;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // print pair of letters from left and right sides
        int lefti = 0, righti = text.length()-1;

        while(lefti<=righti){
            if(lefti == righti) System.out.println(text.charAt(lefti));
            else System.out.println(text.charAt(lefti) + " " + text.charAt(righti));
            lefti++;
            righti--;
        }
    }
}
