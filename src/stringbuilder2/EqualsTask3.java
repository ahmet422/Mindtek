package stringbuilder2;

public class EqualsTask3 {

    public static void main(String[] args) {

        String str1=new String("Apple");
        String str2=new String("Apple");
        StringBuilder stb1=new StringBuilder("Apple");
        StringBuilder stb2=new StringBuilder("Apple");


        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(stb1==stb2);
        System.out.println(stb1.toString()==stb2.toString());
        System.out.println(stb1.toString().equals(stb2.toString()));



    }

}
