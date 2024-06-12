package wrapperclasses;

public class WrapperClasses {

    public static void main(String[] args) {

        int num=10; // primitive data type
        Integer num2=10; // reference data type / Wrapper class

        double doubleNum=5.2;
        Double doubleNum2=5.2;

        boolean isTrue=true;
        Boolean isTrue2=true;

        char c='a';
        Character c2='a';

        System.out.println(Integer.max(5,10));
        System.out.println(Integer.min(2,9));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.parseInt("536"));
    }

}
