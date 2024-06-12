package methods;

import java.util.Arrays;

public class Methods1 {

    public boolean arrayContainsValue(int[] nums, int number){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Methods1 methods=new Methods1();
        int[] nums={3,1,6,8};
        System.out.println(methods.arrayContainsValue(nums, 5));

        int[] nums1={1,5,2};
        int[] nums2={2,1,5,8};
        System.out.println(methods.sameElements(nums1,nums2));
    }

    public boolean sameElements(int[] nums1, int[] nums2){
        if(nums1.length!=nums2.length){
            return false;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0; i<nums1.length; i++){
            if(nums1[i]!=nums2[i]){
                return false;
            }
        }
        return true;
    }

}
