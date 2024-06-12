package stringbuilder2;

public class EqualsMethod {

    public static void main(String[] args) {

        StringBuilder stb1=new StringBuilder("Java");
        StringBuilder stb2=new StringBuilder("Java");

        System.out.println(stb1.equals(stb2));
        System.out.println(stb1.toString().equals(stb2.toString()));

        String str1=new String("Java");
        String str2=new String("Java");

        System.out.println(str1.equals(str2));



    }

}
