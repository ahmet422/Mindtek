package leetcode;

import java.util.*;

public class SortPeople {
    public static void main(String[] args) {
        sortPeople(new String[]{"Mary","John","Bob","Jess"}, new int[]{155,173,166,144});

    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>();
        for(int i = 0; i < names.length; i++) map.put(heights[i],names[i]);
        System.out.println(map);

        String [] res = new String[names.length];
        int index = res.length-1;

        System.out.println(Arrays.toString(res));
        for(String name : map.values()){
            res[index--] = name;

            System.out.println(Arrays.toString(res));
        }
        return res;
    }
}
