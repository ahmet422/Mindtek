package conditions;

public class Task19 {
    public static void main(String[] args) {
        // print the sum of 1 to 500 but skip all numbers that en with 00

       // System.out.println(500*501/2);
        int sum = 0;
        for(int i = 0; i <= 500; i++){
            // avoid all numbers when i ends with 00
            if(i%100 == 0) continue;
            sum= sum + i;
        }
        System.out.println(sum);
    }
}
