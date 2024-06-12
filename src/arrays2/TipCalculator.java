package arrays2;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        /*
        Enter your balance:
        100
        How would you rate our service? (great/good/fair/custom)
        custom
        Enter your tip amount:
        50
        Your total: 150
        Do you want to split the check?
        Yes
        How many people?
        5
        You are splitting the check for &&&&& people
        Each pays: 30
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your balance:");
        int balance=input.nextInt();

        boolean invalidEntry=false;

        int tip = 0;
        do {
            System.out.println("How would you rate our service? (great/good/fair/custom)");
            String service = input.next();
            invalidEntry=false;

            switch (service.toLowerCase()) {
                case "great":
                    tip = 25;
                    break;
                case "good":
                    tip = 20;
                    break;
                case "fair":
                    tip = 10;
                    break;
                case "custom":
                    System.out.println("Enter tip amount:");
                    int tipAmount = input.nextInt();
                    balance += tipAmount;
                    break;
                default:
                    System.out.println("Invalid Entry");
                    invalidEntry=true;
            }
        }while(invalidEntry);

        balance+=balance*tip/100;

        System.out.println("Your total is: "+balance);

        do {
            System.out.println("Do you want to split the check? Yes/No");
            String split = input.next();
            invalidEntry=false;

            if (split.equalsIgnoreCase("No")) {
                System.out.println("Your total is: " + balance);
            } else if (split.equalsIgnoreCase("Yes")) {
                System.out.println("How many people:");
                int people = input.nextInt();
                //  You are splitting the check for &&&&& people
                //  Each pays: 30
                int eachPays = balance / people;

                String icons = "";

                while (people > 0) {
                    icons += "&";
                    people--;
                }

                System.out.println("You are splitting the check " + icons + " people");
                System.out.println("Each pays: " + eachPays);
            }else{
                System.out.println("Invalid Entry");
                invalidEntry=true;
            }

        }while(invalidEntry);

    }

}
