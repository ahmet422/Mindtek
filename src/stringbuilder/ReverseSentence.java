package stringbuilder;

public class ReverseSentence {

    public static void main(String[] args) {

        String str="Java is easy";

        // avaJ si ysae

        // Convert String to StringBuilder
        StringBuilder stb=new StringBuilder(str);
        stb.reverse();
        System.out.println(stb);

        StringBuilder output=new StringBuilder();

        while(stb.lastIndexOf(" ")!=-1){
            int indexOfSpace=stb.lastIndexOf(" ");
            output.append(stb.substring(indexOfSpace+1)).append(" ");
            stb.delete(indexOfSpace,stb.length());
        }

        System.out.println(output.append(stb));

    }

}
