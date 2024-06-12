package variables;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("KM to MILE converter!");
        //0.62137
        // ask a user to enter km, print that amount in miles
        Scanner input = new Scanner(System.in);
        System.out.println("Enter km amount:");
        double kmAmount = input.nextDouble();
        System.out.println(kmAmount + " kms equals to " + (kmAmount * 0.62137) + " miles");
    }
}
