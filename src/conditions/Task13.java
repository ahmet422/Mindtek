package conditions;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // print the total sum of all given positive numbers
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Type a number:");
            int num = input.nextInt();
            if(num<0) break;
        }
        System.out.println("The end");
    }
}
