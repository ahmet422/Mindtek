package arrays2;

import java.util.Scanner;

public class FindFruit {

    public static void main(String[] args) {

        String[] store={"Orange","Banana","Kiwi","Apple","Grapes","Mango"};

        /*
        Enter fruit:
        apple
        We have apple in store
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter fruit:");
        String fruit=input.next();

        boolean found=false;

        for(String f : store){
            if(f.equalsIgnoreCase(fruit)){
                System.out.println("We have "+fruit+" in store");
                found=true;
            }
        }

        // !true -> false
        if(!found) System.out.println("We don't have "+fruit);

    }

}
