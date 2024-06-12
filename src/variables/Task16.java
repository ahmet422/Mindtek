package variables;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // to be able to work legally in US: citizen, green card holder, h1b visa holder
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen? 1->Yes   2->No");
        int q1 = input.nextInt();
        System.out.println("Are you a green card holder? 1->Yes   2->No");
        int q2 = input.nextInt();
        System.out.println("Are you an h1b visa holder? 1->Yes   2->No");
        int q3 = input.nextInt();


        if(q1 == 1 || q2 ==1 || q3==1) System.out.println("You are allowed to work in US");
        else System.out.println("You are not allowed to work in US");

        // print if user can not vote -> only citizen
        boolean isCitizen = q1==1;
        if(!isCitizen) System.out.println("You can not vote!");
        System.out.println(isCitizen);


    }
}
