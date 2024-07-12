package leetcode;

public class RepeatedCharacter {
    public static void main(String[] args) {
        System.out.println('z' - 'a');
    }

    public char repeatedCharacter(String s) {
        // [0,0,0,0,0,0....1,1,1]
        // abcabsd
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++)
            if(letters['z' - s.charAt(i)] == 0) letters['z' - s.charAt(i)] = 1;
            else return s.charAt(i);
        return 'a';
    }


}
