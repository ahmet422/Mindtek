package variables;

public class VariableMath {
    public static void main(String[] args) {

        // operations: + - * / %
        System.out.println("start");

        // +
        int num1 = 5, num2 = 8;
        int sum = num1 + num1 + num1;
        System.out.println(sum);

        int minus = num1 - num2;
        System.out.println(minus);

        int multi = num1 * num2;
        System.out.println(multi);

        // cast num2 to double, convert int num2 into double
        //                    8.0/3
        double div = (double) num2/3;
        System.out.println(div);

        System.out.println("---------");

        // % -> remainder
        int num = 5;
        // a % b -> find remainder from division of a/b
        int remainder = num % 1;
        // even numbers : 10,12,16,88 -> when divided by 2 the rem 0
        // odd numbers : 11,13,33...  -> when divided the rem 1
        System.out.println(remainder);
    }
}
