package exceptionspractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsPractice2 {

    public static void main(String[] args) {

        boolean isException=false;

        do {
            try{
                Scanner input=new Scanner(System.in);
                System.out.println("Enter two numbers:");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                int result = number1 / number2;
                System.out.println("Division of two numbers equals to " + result);
                isException=false;
            } catch (ArithmeticException | InputMismatchException | NullPointerException exception) {
                System.out.println(exception.getMessage());
                isException=true;
                if(exception.getMessage().equalsIgnoreCase("/ by zero")){
                    System.out.println("Number 2 can't be 0");
                }
            }
        } while(isException);

    }

}
