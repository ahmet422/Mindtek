package conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dollars: ");
        double value = input.nextDouble();
        int total = (int)(value*100);

        int quarters = total/25;
        total = total%25;
        System.out.println("Quarters: " + quarters);

        int dimes = total/10;
        total = total%10;
        System.out.println("Dimes: " + dimes);
        int nickels = total/5;
        total= total%5;
        System.out.println("Nickels: " + nickels);
        int pennies = total;
        total= total%1;
        System.out.println("pennies : " + pennies);
        System.out.println("rem: " + total);
    }
}
