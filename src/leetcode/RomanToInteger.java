package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "IIX";
        int res = romanToInt("IIX");

        // 115 // 1 + 1 + 5 = 7   // 1 + 4 = 5
        // IV -> 1 + 5 = 6   -> 4
        System.out.println(res);
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) res = res - map.get(s.charAt(i));
            else res = res + map.get(s.charAt(i));
        }

        res = res + map.get(s.charAt(s.length()-1));

        return res;
    }
}
