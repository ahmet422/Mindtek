package leetcode;

public class Pangram {
    public static void main(String[] args) {
        // a: 97, b: 98, c:99.... z:122
        for(int i = 97; i <= 122; i++) System.out.println((char)i);
    }

    public boolean checkIfPangram(String sentence) {
        for(int i = 97; i < 123; i++)
            if(sentence.indexOf((char)i) == -1) return false;
        return true;
    }
}
