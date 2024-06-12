package variables;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
//        Write a program that asks to enter two int numbers and String as operator, then print
//        correct calculation of two numbers for entered operator.
//        Operators: + - * /
        // get 2 integers
        // get operator
        Scanner input = new Scanner(System.in);
        System.out.println("Num:");
        int num1 = input.nextInt();
        System.out.println("Num:");
        int num2 = input.nextInt();
        System.out.println("Operator:");
        String operator = input.next();

        if(operator.equals("+")) System.out.println("Sum: " + (num1+num2));
        if(operator.equals("-")) System.out.println("Subtraction: " + (num1-num2));
        if(operator.equals("*")) System.out.println("Multiplication: " + (num1*num2));
        // if the num2 is not 0 AND the operator is "/" then do division
        if(operator.equals("/") && num2 != 0) System.out.println("Division: " + (num1/num2));
        if(operator.equals("/") && num2 == 0) System.out.println("Undefined");

        // when the given operator is not + or - or * or /
        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/"))
            System.out.println("Invalid Operator...");
    }
}
