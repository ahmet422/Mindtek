package arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[30000];
        System.out.println(Arrays.toString(arr));

        // write operation : arr[index] = a;
        arr[0] = 56;
        System.out.println(Arrays.toString(arr));
        arr[1] = 156;
        System.out.println(Arrays.toString(arr));

        // read data: int a = arr[index];
        int el = arr[2];
      //  System.out.println(el);

        // print/read all elements:
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // add 2 to every element:
        for(int i = 0; i < arr.length; i++)
            arr[i]+=2;

        System.out.println(Arrays.toString(arr));
    }
}
