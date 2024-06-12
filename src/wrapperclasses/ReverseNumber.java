package wrapperclasses;

public class ReverseNumber {

    public static void main(String[] args) {

        int number=-12300;
        // 123 -> 321

        // 1. int (123) -> String -> StringBuilder
        // 2. .reverse(); method
        // 3. StringBuilder -> String -> int (321)

        StringBuilder stb=new StringBuilder(number+"");
        stb.reverse();
        if(stb.toString().contains("-")){
                                    //  321- -> 321*-1=-321
            number=Integer.parseInt(stb.toString().substring(0,stb.length()-1))*-1;
        }else
            number=Integer.parseInt(stb.toString());
        System.out.println(number);

    }

}
