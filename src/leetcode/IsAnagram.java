package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        isAnagram2("aabcdzz", "ezzaabc");
    }

    public static boolean isAnagram(String s, String t) {
        // if lengths are not equal then it not an anagram
        if(s.length() != t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        // fill up letters from s into the map
        for(int i = 0; i < s.length(); i++){
            char letter1 = s.charAt(i);
            if(map.containsKey(letter1)) map.put(letter1, map.get(letter1) + 1);
            else map.put(letter1,1);

            char letter2 = t.charAt(i);
            if(map.containsKey(letter2)) map.put(letter2, map.get(letter1) - 1);
            else map.put(letter2, -1);
        }

        // check if letter of t is in map:
        for(int i = 0; i < t.length(); i++){
            char letter = t.charAt(i);
            if(!map.containsKey(letter)) return false;
            else{
                if(map.get(letter) == 0) return false;
                map.put(letter, map.get(letter)-1);
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        // if lengths are not equal then it not an anagram
        if(s.length() != t.length()) return false;
        int[] letters = new int[26];

        for(int i = 0; i < s.length(); i++){

            char letter = s.charAt(i);
            int index = 'z' - letter;
            letters[index]++;

            char letter2 = t.charAt(i);
            int index2 = 'z' - letter2;
            letters[index2]--;
        }
        for(int el : letters) if(el != 0) return false;
        return true;
    }
}
