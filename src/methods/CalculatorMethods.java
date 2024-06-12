package methods;

public class CalculatorMethods {


    public static void main(String[] args) {
        // Creating object
        CalculatorMethods methods=new CalculatorMethods();
        System.out.println(methods.getSum(2,3));
        System.out.println(methods.getSum(3,5));
        System.out.println(methods.getSum(4,5));
        System.out.println(methods.getSum(3,100));
        System.out.println(methods.getSum(300,5));

        System.out.println(methods.multiply(2,5));
    }

    public int getSum(int num1, int num2){
        return num1+num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

}
