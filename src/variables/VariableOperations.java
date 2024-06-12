package variables;

public class VariableOperations {
    public static void main(String[] args) {
        // assigning operator : =
        int num1 = 11;
        int num2 = num1;
        num2 =12;
        int num3 = num1;
        num1 = num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("*********");

        String name1 = "Jack";
        String name2 = "Bruno";
        String name3 = name1;
        name1 = name2;
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("***********");

        char symbol1 = 's';
        char symbol2 = 'k';
        char symbol3 = symbol1;
        symbol2 = symbol3;
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
    }
}
