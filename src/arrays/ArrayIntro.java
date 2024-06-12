package arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // type[] name = new type[x];
        // type can be anything: int, char, String, boolean, double...
        // x is the length/size of your arr
        // array is a linear index based data structure: [23,11,45,66]
        //                                                 0  1  2  3
        // once array is created, it will hold default values
        // default value: int -> 0, double -> 0.0, boolean -> false, String -> null
        // to print whole array: sout(Arrays.toString(arr));
        int[] nums = new int[10];
        System.out.println(Arrays.toString(nums));

        // you know what elements you want to store : 5,7,2 ->  type[] name = new type[]{5,7,2};
        int[] nums2 = new int[]{5,7,2};
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums.length);

    }
}
