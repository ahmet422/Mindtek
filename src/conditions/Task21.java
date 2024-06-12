package conditions;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        // find if given word contains any duplicate letter
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word:");
        String word = input.next();
        boolean dupFound = false;
        for(int i = 0; i < word.length(); i++){
            for(int j = i+1; j < word.length(); j++){
               // System.out.println("Compare: " + word.charAt(i) + " - "+ word.charAt(j));
                if(word.charAt(i)==word.charAt(j)){
                    dupFound = true;
                    break;
                }
            }
            if(dupFound) break;
        }

        if(dupFound) System.out.println("Dup found");
        else System.out.println("No dup found");
    }
}
