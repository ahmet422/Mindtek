package conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ask a user to enter a number of day: 1-7
        // 1 -> Monday, 2 -> Tuesday, 3 -> Wednesday, 4 -> Thursday
        // 5 -> Friday, 6 -> Saturday, 7 -> Sunday
        // -2, 0, 8, 678 -> Invalid day
        Scanner input = new Scanner(System.in);
        System.out.println("Day:");
        int day = input.nextInt();

//        if(day==1) System.out.println("Monday");
//        else if(day==2) System.out.println("Tuesday");
//        else if(day==3) System.out.println("Wednesday");
//        else if(day==4) System.out.println("Thursday");
//        else if(day==5) System.out.println("Friday");
//        else if(day==6) System.out.println("Saturday");
//        else if(day==7) System.out.println("Sunday");
//        else System.out.println("Invalid day!");

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
