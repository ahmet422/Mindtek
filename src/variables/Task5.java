package variables;

import java.util.Date;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Age finder!");
        // ask a user what year they were born : 2000
        // print: You should be x year old
        Scanner input = new Scanner(System.in);
        System.out.println("Year you were born?");
        int year = input.nextInt();
        System.out.println("You should be " + (2024-year) + " years old");
    }
}
