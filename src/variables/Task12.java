package variables;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // ask a user to enter 4 numbers
        // print: Sum of even numbers: x
        // print: Sum of odd numbers: y
        // Ex: 3,4,5,6  Sum of even: 10    Sum of odd: 8
        // Ex: 3,1,5,6  Sum of even: 6     Sum of odd: 9
        // Ex: 2,4,8,2  Sum of even: 16    Sum of odd: 0
        int evenSum = 0, oddSum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Num1:");
        int num = input.nextInt();
        boolean isEven = num%2==0;
        if(isEven) evenSum += num; // evenSum = evenSum + num;
        else oddSum += num;

        System.out.println("Num2:");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Num3:");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Num4:");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}
