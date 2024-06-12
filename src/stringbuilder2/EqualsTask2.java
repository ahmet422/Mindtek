package stringbuilder2;

public class EqualsTask2 {

    public static void main(String[] args) {

        StringBuilder stb1=new StringBuilder("Java");
        StringBuilder stb2=new StringBuilder("Apple");
        String str1=new String("Java");
        String str2=stb1.toString(); // "Java"

        System.out.println(stb1.toString().equals(str1)); // true
        System.out.println(stb1.equals(stb2)); // false
        System.out.println(str1.equals(str2));  // true

        stb2=stb1;

        System.out.println(stb1.equals(stb2)); // true

    }

}
