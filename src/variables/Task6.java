package variables;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Check you eligibility to apply for Driver License");
        // ask a user what year they were born
        // calculate their age
        // if age >= 16 print "You are eligible"
        // else print "Sorry not yet"
        Scanner input = new Scanner(System.in);
        System.out.println("Your birth year:");
        int year = input.nextInt();
        int age = 2024 - year;
        boolean isEligible = age >= 16;

        if(isEligible) {
            System.out.println("You are eligible");
        }else{
            System.out.println("Not yet");
            System.out.println("You can come back in " + (16-age) + " years");
        }
    }
}
