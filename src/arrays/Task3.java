package arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10,30,5,6};
        // count total number of even elements
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i]%2 == 0) count++;

        System.out.println("Even elements: " + count);

        // create a new array which holds all even values taken
        // from arr and print that new array
        int[] evenArr = new int[count];
        int ei = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(evenArr));
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element from arr: " + arr[i]);
            int el = arr[i];
            if(el%2==0){
                System.out.println("is even therefore putting it into even array");
                evenArr[ei] = el;
                ei++;
                System.out.println(Arrays.toString(evenArr));
            }else System.out.println("This el is not even.");
        }
        System.out.println(Arrays.toString(evenArr));
    }
}
