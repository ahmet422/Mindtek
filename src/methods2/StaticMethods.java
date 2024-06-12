package methods2;

public class StaticMethods {

    public static int getAverage(int[] nums){
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        return sum/nums.length;
    }

    public static void main(String[] args) {
        int[] nums={2,4,8,10};

        System.out.println(getAverage(nums));
    }

}
