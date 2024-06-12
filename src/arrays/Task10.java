package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[] nums = {123,145,167,1000,234,345,567,789};

        System.out.println(Arrays.toString(nums));
        // find and print index of given value
        Scanner input = new Scanner(System.in);
        System.out.println("Search for which value?");
        int value = input.nextInt();
//        int index = -1;
//        // compare each element from array with value
//        for(int i = 0; i < nums.length; i++) {
//            System.out.println("iteration " + i);
//            if(nums[i] == value) {
//                index = i;
//                break;
//            }
//        }
        // print
        System.out.println("Index: " + Arrays.binarySearch(nums,value));
        // time complexity : O(n)
    }
}
