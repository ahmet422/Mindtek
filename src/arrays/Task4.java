package arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {10,30,5};
        // create a new array and put all elements from arr into your new array
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int el = arr[i];
            arr2[i] = el;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
