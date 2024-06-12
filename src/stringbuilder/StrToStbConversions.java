package stringbuilder;

public class StrToStbConversions {

    public static void main(String[] args) {

        // String to StringBuilder
        String str="John";
        StringBuilder stb=new StringBuilder(str);

        // StringBuilder to String
        String str2=stb.toString();

        String word="Sun";

        System.out.println(new StringBuilder(word.toLowerCase()).reverse());

    }

}
