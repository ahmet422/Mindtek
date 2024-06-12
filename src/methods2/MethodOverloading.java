package methods2;

public class MethodOverloading {

    public static int getSum(int num1, int num2) {
        return num1+num2;
    }

    public int getSum(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }

    public double getSum(double[] nums){
        double sum=0;
        for(double num:nums){
            sum+=num;
        }
        return sum;
    }

    public double getSum(double num1, double num2){
        return num1+num2;
    }

    public static void main(String[] args) {

        MethodOverloading methods=new MethodOverloading();

        System.out.println(methods.getSum(5,10.5));

        int[] nums={5,10,15,20};

        System.out.println(methods.getSum(nums));

        System.out.println(StaticMethods.getAverage(nums));

    }


}
