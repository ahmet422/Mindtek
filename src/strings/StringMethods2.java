package strings;

public class StringMethods2 {
    public static void main(String[] args) {
        //             012345678910
        String word = "programming";
        // substring:
      //  String text = word.substring(4,7); // start from 4 go up to 7
        String text = word.substring(4);// start from 4 go until end
        System.out.println(text);

        // replace:
        System.out.println(word.replace('m','d'));
        System.out.println(word);
    }
}
