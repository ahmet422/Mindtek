package variables;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // ask a user to enter 3 ints
        // print the total count of positive ints
        // print the total count of negative ints
        // 1,2,3 ->  pos: 3 neg:0
        // 1,-2,3 -> pos: 2 neg:1
        int  posCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Num:");
        int num = input.nextInt();
        if(num>0) ++posCount; // posCount = posCount + 1;


        System.out.println("Num:");
        num = input.nextInt();
        if(num>0) ++posCount; // posCount = posCount + 1;


        System.out.println("Num:");
        num = input.nextInt();
        if(num>0) ++posCount; // posCount = posCount + 1;


        System.out.println("Count of positive numbers: " + posCount);
        System.out.println("Count of negative numbers: " + (3-posCount));
    }
}
