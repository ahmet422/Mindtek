package strings;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String emailDB = "user@gmail.com";
        String passwordDB = "user1234";
        // ask a user to enter: email and password
        // if given email matches with emailDb AND
        // given password matches with passwordDB -> Logging in
        // otherwise print -> wrong credentials
        Scanner in = new Scanner(System.in);
        System.out.println("Your email:");
        String givenEmail = in.next();
        System.out.println("Your password: ");
        String givenPassword = in.next();
        boolean validCredentials = emailDB.equals(givenEmail) && passwordDB.equals(givenPassword);
        if(validCredentials) System.out.println("Logging in...");
        else System.out.println("Wrong credentials...");
        if(!emailDB.equals(givenEmail)) System.out.println("Email is incorrect");
        if(!passwordDB.equals(givenPassword)) System.out.println("Password is incorrect");
    }
}
