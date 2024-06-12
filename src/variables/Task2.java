package variables;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double breadPrice = 4.78;
        System.out.println("The price of bread is: $" + breadPrice);
        System.out.println("How much are you going to pay?");
        // if customer pay 5 then change $1.56
        // if customer pay 10 then change $6.56
        // if customer pay 100 then change $96.56
        Scanner input = new Scanner(System.in);
        int givenMoney = input.nextInt();
        double change = givenMoney - breadPrice;
        System.out.println("Your change is $" + change);
    }
}
