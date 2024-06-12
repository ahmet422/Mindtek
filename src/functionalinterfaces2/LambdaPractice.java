package functionalinterfaces2;

public class LambdaPractice {

    public static void main(String[] args) {

        StringManipulation strMan = (x) -> x.toUpperCase();

        System.out.println(strMan.execute("Java"));

        StringManipulation strMap2 = (x) -> ""+x.charAt(0) + x.charAt(x.length()-1);

        System.out.println(strMap2.execute("Mindtek"));

        StringManipulation strMap3= (x) -> {
            if(x.length()>=5){
                return x.toUpperCase();
            }else{
                return x.toLowerCase();
            }
        };

        System.out.println(strMap3.execute("lambda"));

    }

}
