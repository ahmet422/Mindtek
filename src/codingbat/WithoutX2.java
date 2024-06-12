package codingbat;

public class WithoutX2 {
    public static void main(String[] args) {
        // if one or both of the first 2 chars is 'x',
        // return the string without those 'x' chars, and otherwise return the string unchanged.
        //   xHxllo
        String word = "xHxllo";
        System.out.println(word.substring(0,2));
        if(word.length()<2 ) word = "";
        if(word.charAt(0)=='x' || word.charAt(1)=='x') word = word.replaceFirst("x","");
        if(word.charAt(0)=='x') word = word.replaceFirst("x","");
        System.out.println(word);
    }
}
