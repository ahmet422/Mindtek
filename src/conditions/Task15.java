package conditions;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int secretNum = (int)(Math.random() * ((10 - 1) + 1));
        if(secretNum==0) secretNum++;
//        System.out.println(secretNum);
        System.out.println("You have 3 chances. Try to guess my number. " +
                "It is in a range of 1 to 10");
        int chances = 3;
        boolean isVictory = false;
        Scanner input = new Scanner(System.in);
        while(chances>0){
            System.out.println("Your guess?");
            int givenNum = input.nextInt();
            chances--;
            if(chances==0) break;
            if(givenNum>secretNum) System.out.println("Go DOWN");
            else if(givenNum<secretNum) System.out.println("Go UP");
            else{
                System.out.println("You WON, the number was " + secretNum);
                isVictory = true;
                break;
            }
        }

        if(!isVictory) System.out.println("You lost, my number was: " + secretNum);
    }
}
