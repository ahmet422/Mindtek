package leetcode;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber1(int[] nums) {
        int temp = 0;
        Arrays.sort(nums);
        for(int el : nums){
            if(el != temp) return el;
            temp++;
        }
        return 0;
    }

    public int missingNumber(int[] nums) {
        // 1,2,3    n*(n+1)/2 = 6 -> 0
        // 1,2,0    6 ->
        int sum = 0;
        for (int el : nums) sum += el;
        int n = nums.length;
        int res = (n*(n+1))/2;
        return res-sum;
    }
}
