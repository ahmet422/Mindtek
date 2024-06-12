package conditions;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your age: ");
        int age = input.nextInt();

        // you are young(age<13) , 13<=age<=19 teenager, 19<age<=60 adult, age>60 senior
       if(age>0 && age<120){
           if(age<13){
               System.out.println("Young");
           }else if(age>=13 && age <=19){
               System.out.println("Teenager");
           }else if(age>19 && age <= 60){
               System.out.println("Adult");
           }else {
               System.out.println("Senior");
           }
       }else System.out.println("Invalid age");
    }
}
