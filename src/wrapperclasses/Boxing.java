package wrapperclasses;

public class Boxing {

    public static void main(String[] args) {

        // AUTOBOXING
        int num=5;
        // Primitive -> Wrapper
        Integer numWrapper=num;

        // UNBOXING
        Integer number=new Integer(10);
        // Wrapper -> Primitive
        int numberPrimitive=number;

        String str="54890.5";
        // String -> int
        double strNum=Double.parseDouble(str);
        System.out.println(strNum+5);

        String value="123";
        // String -> int ===> parseInt();
        int strValuePrimitive=Integer.parseInt(value);
        // String -> Integer ===> valueOf();
        Integer strValue=Integer.valueOf(value);


    }

}
