package arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // create arr which holds 5 string elements
        // then print it
        // then add elements: "java", "python", "c++", "javascript","c#"
        // print again
        String[] languages = new String[5];
        System.out.println(Arrays.toString(languages));
        languages[0] = "sql";
        languages[1] = "python";
        languages[2] = "c++";
        languages[3] = "css";
        languages[4] = "c#";
        System.out.println(Arrays.toString(languages));
        // make every el from arr all uppercase
        for(int i = 0; i<languages.length; i++) languages[i] = languages[i].toUpperCase();

        System.out.println(Arrays.toString(languages));
        // find the total amount of letter "A" in whole array
        String arrAsString = Arrays.toString(languages);
        System.out.println(arrAsString);
        int count = 0;
        for(int i = 0; i < arrAsString.length(); i++){
            if(arrAsString.charAt(i)=='A') count++;
        }

        System.out.println("Total number of A is "+ count);
    }
}
