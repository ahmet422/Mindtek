package variables;

import methods.CalculatorMethods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ask a user to enter 2 integer numbers
        // then print + sum of given numbers
        // Ex: type number: 40
        //     type number: 6
        // + 46
        // implementation:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // ask 2 numbers and print their multiplication => 50 and 3 -> 150
        System.out.println("Enter a number: ");
        int num3 = input.nextInt();
        System.out.println("Enter a number: ");
        int num4 = input.nextInt();
        int result = num3 * num4;
        System.out.println("Multiplication: " + result);
        System.out.println("end!");

        CalculatorMethods methods=new CalculatorMethods();
        System.out.println(methods.getSum(2,3));

    }
}
