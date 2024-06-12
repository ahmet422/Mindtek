package wrapperclasses;

public class OtherMethods {

    public static void main(String[] args) {

        Character c='a';

        System.out.println(Character.isLetter('a'));

        char letter='4';

        if( (letter>=65&&letter<=90) || (letter>=97&&letter<=122)){
            System.out.println("It is letter");
        }

        System.out.println(Character.isDigit('a'));

        System.out.println(Boolean.parseBoolean("False"));

    }

}
