package conditions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = input.nextLine();
        // print reversed version of a given string
        int index = text.length()-1;
        String res = "";
        while(index>=0){
            res = res + text.charAt(index);
            System.out.println(res);
            index--;
        }
        System.out.println(res);
    }
}
