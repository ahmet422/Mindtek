package variables;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
//        If all three sides are equal, it's an equilateral triangle.
//        If two sides are equal, it's an isosceles triangle.
//        If all three sides are different, it's a scalene triangle.
        Scanner input = new Scanner(System.in);

        int side1 = input.nextInt(), side2 = input.nextInt(), side3=input.nextInt();

        if(side1 != side2 && side1 != side3 && side2 != side3) System.out.println("scalene triangle");
        if(side1 == side2 && side1 == side3 && side2 == side3) System.out.println("equilateral triangle");

        if((side1 == side2 && side1 != side3)
                || (side1 == side3 && side1 != side2)
                || (side2==side3 && side2!=side1))
            System.out.println("isosceles triangle");
    }
}
