package methods;

import java.util.Arrays;

public class Methods2 {

    public int[] findTarget(int[] nums, int target){

        int[] indexes=new int[2];

        LOOP: for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    indexes[0]=i;
                    indexes[1]=j;
                    break LOOP;
                }
            }
        }
        if(indexes[0]==0 && indexes[1]==0) {
            return null;
        }
        return indexes;
    }

    public static void main(String[] args) {
        Methods2 methods=new Methods2();
        int[] nums={2,5,2,8};
        System.out.println(Arrays.toString(methods.findTarget(nums,10)));
    }

}
