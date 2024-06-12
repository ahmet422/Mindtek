package variables;

public class Test2 {
    public static void main(String[] args) {
        String word = "a"; // a:97  b:98
        int sum = 0;
        for(int i =0; i < word.length(); i++)
            sum = sum + word.charAt(i);


        System.out.println(sum);
    }
}
