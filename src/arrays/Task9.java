package arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = {1,-5,0,3,-7};
        // create 2 new arrays, regroup element into pos and neg
        int countPos = 0;
        int countNeg = 0;
        // count how many pos and neg I have

        for(int el : nums){
            if(el>0) countPos++;
            else if(el<0) countNeg++;
        }

        int[] posArr = new int[countPos];
        int[] negArr = new int[countNeg];
        // regroup pos and negatives
        int posArrI = 0, negArrI = 0;

        for(int el : nums){
            if(el>0){
                posArr[posArrI] = el;
                posArrI++;
            }else if(el<0){
                negArr[negArrI] = el;
                negArrI++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(posArr));
        System.out.println(Arrays.toString(negArr));
    }
}

