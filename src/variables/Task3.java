package variables;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Square area and perimeter calculator");
        // ask a user to enter length of a square (int)
        // print calculated area and calculated perimeter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length:");
        int length = input.nextInt();
        System.out.println("Area: " + (length*length));
        System.out.println("Perimeter: " + (4*length));
    }
}
