package funationalinterfaces3;

import java.util.Arrays;
import java.util.function.BiFunction;

public class BiFunctionInterface {

    public static void main(String[] args) {

        BiFunction<String[], String[], String[]> combineArrays= (x,y) -> {
            String[] output=new String[x.length+y.length];
            for(int a=0,b=0; a<output.length; a++){
                // 2<2 -> false
                if(a<x.length){
                    output[a]=x[a];
                }else{
                    // a=2 , b=0
                    output[a]=y[b];
                    b++;
                }
            }
            return output;
        };

        String[] arr1={"Java","Lava"};
        String[] arr2={"Python"};

        System.out.println(Arrays.toString(combineArrays.apply(arr1,arr2)));

    }

}
