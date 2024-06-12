package variables;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Even vs Odd");
        //ask a user to enter any integer
        //if given num is even print "Even", otherwise print "Odd"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int givenNum = input.nextInt();
        if(givenNum%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
