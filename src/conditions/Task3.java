package conditions;

public class Task3 {
    public static void main(String[] args) {
        // print all numbers from 100 to 50
        int sum = 0;
        int num = 100;
        while(num >= 50) {
            sum = sum + num;
            if(num%2 == 0) System.out.println(num);
            num--;
        }

        System.out.println("Sum: " + sum);
    }
}
