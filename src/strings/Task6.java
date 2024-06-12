package strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String password = "5689";
        //ask a user to enter password
        // if they enter 5689 -> "Door is opening"
        // if they enter not 5689 -> "Wrong Password"
        System.out.println("Enter a password to open the garage");
        Scanner in = new Scanner(System.in);
        if(password.equals(in.next())) System.out.println("Opening");
        else System.out.println("Wrong password");
    }
}
