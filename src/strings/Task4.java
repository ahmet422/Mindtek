package strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Initials Creator => Ahmet    -> A
        // ask a user to enter firstName, lastName
        // print initials of that person
        Scanner input = new Scanner(System.in);
        System.out.println("First name: ");
        String fName = input.next().toUpperCase();
      //  if(fName.isEmpty()) System.out.println("The given name is empty");
        System.out.println("Last name: ");
        String lName = input.next().toUpperCase();
        System.out.println("Initials: " + fName.charAt(0) + lName.charAt(0));
    }
}
