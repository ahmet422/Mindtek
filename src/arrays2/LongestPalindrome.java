package arrays2;

public class LongestPalindrome {

    public static void main(String[] args) {

        String palindromes="civic kayak racecar mom madam";

        // Get the longest palindrome - racecar

        String[] words=palindromes.split(" ");

        int max=0;

        // Finding maximum length
        for(String palindrome: words){
            //   5<7
            if(max<palindrome.length()){
                max=palindrome.length();
            }
        }

        // Finding palindrome that has maximum length
        for(String palindrome: words){
            if(max==palindrome.length()){
                System.out.println(palindrome);
            }
        }


    }

}
