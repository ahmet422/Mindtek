package stringbuilder2;

public class EqualsMethod2 {

    public static void main(String[] args) {

        StringBuilder stb1=new StringBuilder("Apple");
        StringBuilder stb2=new StringBuilder("Apple");
        StringBuilder stb3=new StringBuilder("Apple");

        stb1=stb2;

        System.gc();

        stb1=new StringBuilder("Apple");

        System.out.println(stb1.equals(stb2));

        stb2=stb3;

        System.out.println(stb1.equals(stb2));

        System.out.println(stb2.equals(stb3));

        stb1=stb2;

        System.out.println(stb1.equals(stb3));

        System.gc();

    }

}
