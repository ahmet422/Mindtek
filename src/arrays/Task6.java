package arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        char[] symbols = {'A','$','h','H','y','#', '*', '#','k'};
        // create 2 arrays: regroup uppercase letters and lowercase letters
        // 64 - 91 A -Z
        // 97 - 122 a-z
        int countU = 0, countL=0, countS = 0;
        for(int i = 0; i < symbols.length; i++){
            char letter = symbols[i];
            if(letter>=97 && letter<=122) countL++;
            else if(letter>=64 && letter <=91) countU++;
            else countS++;
        }

        char[] uppArr = new char[countU];
        char[] lowArr = new char[countL];
        char[] symArr = new char[countS];

        int li = 0, ui = 0, si = 0;

        for(int i = 0; i < symbols.length; i++){
            char letter = symbols[i];
            if(letter>=97 && letter<=122) {
                lowArr[li] = letter;
                li++;
            }
            else if(letter>=64 && letter <=91) {
                uppArr[ui] = letter;
                ui++;
            }
            else {
                symArr[si] = letter;
                si++;
            }
        }

        System.out.println(Arrays.toString(uppArr));
        System.out.println(Arrays.toString(lowArr));
        System.out.println(Arrays.toString(symArr));


    }
}
