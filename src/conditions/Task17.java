package conditions;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        // keep asking a user to enter a word until they enter "exit"
        // for each given word construct a new word by putting * after every letter and print it
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Type a word:");
            String text = input.next();
            if(text.equals("exit")) break;
            // task 16
            String res = "";
            int i = 0;
            while(i < text.length()){
                res = res + text.charAt(i) + "*";
                i++;
            }
            System.out.println(res);
        }
        System.out.println("The end!");
    }
}
