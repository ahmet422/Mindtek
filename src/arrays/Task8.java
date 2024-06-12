package arrays;

public class Task8 {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'h', 'C'};
        // calculate the sum of numeric values of all elements in letters
        int sum = 0;
    //    for(int i = 0; i < letters.length; i++) sum = sum + letters[i];
        for(char el : letters) sum = sum + el;
        System.out.println(sum);
    }
}
