package leetcode;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};  // O(logN) 1024 element -> 10 look ups needed
        System.out.println(search(nums,2));
    }

    public static int search(int[] nums, int target) {
        int lefti = 0, righti = nums.length-1;
        while(lefti<righti){
            int middi = (righti+lefti)/2;
            if(nums[middi] == target) return middi;
            if(nums[middi]>target) righti = middi;
            else if (nums[middi]<target) lefti = middi;
            if(lefti+1==righti) break;
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        return Arrays.binarySearch(nums,target);
    }
}
