package conditions;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // keep asking a user to enter a word until they enter "exit"
        // ask which character they want to put after each letter : 1 # or 2 *
        //  construct a new word by putting selected char after every letter and print the word
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Type a word:");
            String text = input.next();
            if(text.equals("exit")) break;
            String res = "";
            while(true){
                System.out.println("Which char to put?: ");
                System.out.println("1 #");
                System.out.println("2 *");
                int selection = input.nextInt();
                // task 16

                int i = 0;
                if(selection==1){
                    while(i < text.length()){
                        res = res + text.charAt(i) + "#";
                        i++;
                    }
                    break;
                }else if(selection==2){
                    while(i < text.length()){
                        res = res + text.charAt(i) + "*";
                        i++;
                    }
                    break;
                }else System.out.println("Invalid selection");
            }
            System.out.println(res);
        }
        System.out.println("The end!");
    }
}
