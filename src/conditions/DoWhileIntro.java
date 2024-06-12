package conditions;

import java.util.Scanner;

public class DoWhileIntro {
    public static void main(String[] args) {
        // do{  } while(condition)
        //print numbers from 1 to 5
        Scanner input = new Scanner(System.in);
        int num = 55;
        // first execute the code at least one time then check the condition
        do{
            System.out.println("Enter pos number:");
            num = input.nextInt();
        }while(num>0);

        // first check condition then execute
//        while(num<=5){
//            System.out.println(num);
//            num++;
//        }
    }
}
