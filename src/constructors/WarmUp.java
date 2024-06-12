package constructors;

public class WarmUp {

    int a=2;
    static int b=5;

    public static void main(String[] args) {
        WarmUp.b=1;
        WarmUp warmUp1=new WarmUp();
        // a=10
        // b=5
        WarmUp warmUp2=new WarmUp();
        // a=2
        // b=5

        warmUp1.a=10;

        System.out.println(warmUp1.a+warmUp2.b); // 10+1=11
        System.out.println(warmUp2.a+warmUp1.b); // 2+1=3

    }

}
