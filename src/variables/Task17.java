package variables;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Chicago Marathon application app");
        // to be able to apply:
        // person must live in Chicagoland area
        // 22<= age <= 65
        // gender can be Male or Female
        // ask a user if they live in Chicagoland area: 1 yes   2 no
        // ask a user their age, evaluate if age is valid
        // ask a user their gender: 1 yes    2 no
        // from all given info print if this person can apply or no
        Scanner input = new Scanner(System.in);
        System.out.println("Do you live in Chicagoland area? 1-> Yes    2->No");
        int q1 = input.nextInt();
        System.out.println("You age?");
        int age = input.nextInt();
        System.out.println("Your gender: 1-> Male    2->Female");
        int q3 = input.nextInt();

        boolean isInChicago = q1 == 1;
        boolean isValidAge = age >= 22 && age <=65;
        boolean isValidGender = q3 == 1 || q3 == 2;
        //if(q1==1 && age >= 22 && age <=65 || q3==1 || q3==2) System.out.println("You can apply");
        if(isInChicago && isValidAge && isValidGender) System.out.println("You can apply");
        else System.out.println("Sorry, you do not meet all criteria...");
    }
}
