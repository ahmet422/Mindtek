package arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        // replace each element in array with its cube : 5 -> 5*5*5 = 125
        // find total sum of all elements
        // find average of all elements
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i] * arr[i];
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " +sum);
        System.out.println("Average: " + ((double)sum / arr.length));
    }
}
