package conditions;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // keep asking a user to enter a positive number
        // until they enter negative value -> The end
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Type a number:");
            int num = input.nextInt();
            if(num<0) break;
            sum+=num; // sum = sum + num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("The end");
    }
}
