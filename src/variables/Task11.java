package variables;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // ask a user to enter 4 numbers -> 5,2,1,3 -> Total: 11
        // print the total sum of the given numbers
        int sum = 0;
        Scanner input = new Scanner(System.in);
//        System.out.println("Num1: ");
//        int n1 = input.nextInt();
//        System.out.println("Num2: ");
//        int n2 = input.nextInt();
//        System.out.println("Num3: ");
//        int n3 = input.nextInt();
//        System.out.println("Num4: ");
//        int n4 = input.nextInt();
//        sum = n1 + n2 + n3 + n4;
        System.out.println("Num1:");
        int num = input.nextInt();
        sum = sum + num;
        System.out.println("Num2:");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Num3:");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Num4:");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Total: " + sum);
    }
}
