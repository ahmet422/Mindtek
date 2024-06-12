package arrays;

import java.util.Arrays;

public class TwoDimensionalArrayIntro {
    public static void main(String[] args) {
        int [][] coordinations = {{77,12,23},{56,78,66},{99,89,432}};
        System.out.println(coordinations.length);
        System.out.println(coordinations[0].length);


        System.out.println(Arrays.toString(coordinations));
        for(int[] arr : coordinations) System.out.println(Arrays.toString(arr));
        System.out.println("----");
        Arrays.sort(coordinations[0]);
        // add 1 to every odd element
        for(int i = 0; i < coordinations.length; i++){
            for(int j = 0; j < coordinations[i].length; j++){
               if(coordinations[i][j] %2 ==1) coordinations[i][j]++;
            }
        }
        for(int[] arr : coordinations) System.out.println(Arrays.toString(arr));

    }
}
