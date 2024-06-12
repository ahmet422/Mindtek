package arrays;

import java.util.Arrays;

public class ArrayMisc {
    public static void main(String[] args) {
        String text = "I am learning java";
        String products = "mouse-table-keyboard-computer";
        String[] words = products.split("-");
        System.out.println(Arrays.toString(words));
        for(String el : words) System.out.println(el);
        char[] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars));
        int[] nums = {6,8,1,2,4};
        Arrays.sort(nums);
        Arrays.sort(words);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(nums));
    }
}
