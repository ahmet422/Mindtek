package leetcode;

public class CountMaximum {
    public static void main(String[] args) {
        maximumCount(new int[]{-8,-5,-4,-2,-1,0,0,1,2,5,7});
    }

    public int maximumCount1(int[] nums) {
        int neg=0, pos=0;
        for(int el:nums)
            if(el<0) neg++;
            else if(el>0) pos++;
        return Math.max(neg,pos);
    }

    public static int maximumCount(int[] nums) {
        if(nums[0]>0 || nums[nums.length-1]<0) return nums.length;

        int l = 0, r = nums.length-1, mid = 0;
        // find first occurrence of zero
        while(l<r){
            mid = l + (r-l)/2;
            if(nums[mid] < 0) l = mid+1;
            else r = mid;
        }

        int neg = l;
        l=0; r = nums.length;
        while(l<r){
            mid = l + (r-l)/2;
            if(nums[mid]>0) r = mid;
            else l= mid+1;
        }
        int pos = nums.length - l;
        return Math.max(neg,pos);
    }
}
