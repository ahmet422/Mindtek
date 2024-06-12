package variables;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // ask a user to enter 3 numbers
        // print sum of positive nums
        // print sum of negative nums
        // 1,-2,-4   -> PosSum: 1  NegSum: -6
        // 1,2,3    -> PosSum: 6  NegSum: 0
        // -1,-2,-1   -> PosSum: 0  NegSum: -4
        int posSum = 0, negSum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Num:");
        int num = input.nextInt();
        boolean isPos = num > 0;
        if(isPos) posSum += num;
        else negSum += num;

        System.out.println("Num:");
        num = input.nextInt();
        isPos = num > 0;
        if(isPos) posSum  = posSum + num;
        else negSum += num;

        System.out.println("Num:");
        num = input.nextInt();
        isPos = num > 0;
        if(isPos) posSum += num;
        else negSum += num;

        System.out.println("pos sum: " + posSum);
        System.out.println("neg sum: " + negSum);
    }
}
