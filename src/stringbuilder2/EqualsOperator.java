package stringbuilder2;

public class EqualsOperator {

    public static void main(String[] args) {

        String str1=new String("Java");
        String str2=new String("Java");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true



    }

}
