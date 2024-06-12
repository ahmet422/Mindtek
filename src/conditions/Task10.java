package conditions;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // keep asking a user to enter any number until they enter 55
        Scanner input = new Scanner(System.in);
//        while(true){
//            System.out.println("I will keep asking number until you enter 55");
//            System.out.println("Your number: ");
//            int num = input.nextInt();
//            if(num == 55) {
//                System.out.println("The end");
//                break;
//            }
//        }
        int num = 0;
        while(num != 55){
            System.out.println("I will keep asking number until you enter 55");
            System.out.println("Your number: ");
            num = input.nextInt();
        }

        System.out.println("The end");

        int number = 0;
        String text = "55";
        if(!text.equals("exit")) {
             number = Integer.parseInt(text);
        }
        System.out.println();
    }
}
