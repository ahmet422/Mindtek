package stringbuilder;

public class StbExample {

    public static void main(String[] args) {

        long startTimeStb=System.currentTimeMillis();

        //   reference   =   object
        StringBuilder stb=new StringBuilder("Java");
        stb.append(" is easy");
        System.out.println(stb);

        long endTimeStb=System.currentTimeMillis();

        System.out.println("Time for StringBuilder: "+(endTimeStb-startTimeStb));

        long startTimeStr=System.currentTimeMillis();

        String str="Java";
        str=str+" is easy";
        System.out.println(str);

        long endTimeStr=System.currentTimeMillis();

        System.out.println("Time for String: "+(endTimeStr-startTimeStr));

    }

}
