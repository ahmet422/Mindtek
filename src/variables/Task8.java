package variables;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Adult or not Adult");
        // ask a user their age
        // if age >= 18 print "adult", otherwise print "not adult"
        Scanner input = new Scanner(System.in);
        System.out.println("Your age:");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
    }
}
