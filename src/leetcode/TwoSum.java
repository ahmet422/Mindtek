package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
            for(int j = i+1; j < nums.length; j++)
                if(nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
