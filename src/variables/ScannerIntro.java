package variables;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, type your Name:");
        String name = input.next();
        System.out.println("You age: ");
        String age = input.next();
        System.out.println("Welcome " + name);
        System.out.println("Your age is: " + age);
    }
}
