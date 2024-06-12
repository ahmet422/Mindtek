package methods2;

public class WarmUp {

    public static void main(String[] args) {

        StringBuilder stb1=new StringBuilder("Orange");
        StringBuilder stb2=new StringBuilder("Orange");
        StringBuilder stb3=new StringBuilder("Orange");

        String str1="Orange";
        String str2="Orange";

        stb1=stb3;

        System.out.println(stb1.equals(stb2)); // false
        System.out.println(stb1.equals(stb3)); // true
        System.out.println(stb1.toString().equals(stb3.toString())); // true

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true


    }

}
