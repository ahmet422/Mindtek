package strings;

public class StringMethods {
    public static void main(String[] args) {
        // .indexOf('a'); as a param give one char, returns back an int
        //             012345678
        String word = "universe";
        System.out.println(word.indexOf('v'));
        System.out.println(word.lastIndexOf('v'));

        // contains method
        System.out.println(word.contains("se"));

        // equals:
        System.out.println(word.equals("uniVerse"));
        System.out.println(word.equalsIgnoreCase("UNIverse"));

        // startsWith:
        System.out.println(word.startsWith("uni"));
        System.out.println(word.endsWith("a"));

        // trim:
        String name = "  Jack  Smith  ";
        System.out.println(name.length());
        System.out.println(name.trim().length());
        name = name.trim();
        System.out.println(name.length());

        // chaining:
        String el = "  java ";
        // make sure all letters are uppercase
        // remove empty space from both sides and find if the length of trimmed
        // el is even?
        /*
        el = el.toUpperCase();
        el = el.trim();
        int length = el.length();
        boolean isEven = length%2==0;
        if(isEven) System.out.println("Length is even");
        else System.out.println("Length is Odd");
         */
        if(el.trim().toUpperCase().length() %2 == 0) System.out.println("Length is even");
        else System.out.println("Length is Odd");


    }
}
