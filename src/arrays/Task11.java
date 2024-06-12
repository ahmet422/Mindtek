package arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int [][] coordinations = {{77,12,23},{56,78,66},{99,89,432}};

        // add 100 to all numbers less than 90
        // subtract 100 to all numbers greater than 90
        for(int i = 0; i < coordinations.length; i++){
            for(int j = 0; j < coordinations[i].length; j++){
                if(coordinations[i][j] < 90) coordinations[i][j]+=100;
                else if(coordinations[i][j] > 90) coordinations[i][j]-=100;
            }
        }

        for(int[] arr : coordinations) System.out.println(Arrays.toString(arr));
    }

    public int islandPerimeter(int[][] grid) {
        // go through each el if val == 1 island++, check right and lower squares if neighbor found neigbor++
        int island=0, neighbors = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    island++;
                    //check right cell
                    if(grid[i][j+1]==1) neighbors++;
                    //check lower cell
                    if(grid[i+1][j]==1) neighbors++;
                }
            }
        }

        return 4*island - 2*neighbors;
    }
}
