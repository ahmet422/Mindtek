package variables;

public class Operators {
    public static void main(String[] args) {
        int num = 10;
        // add 5 to num
        num -= 5; //num = num - 5;
        System.out.println(num);

        int num2 = 11;
        // add 1 to num2
        // num2++; // num2 += 1; // num2 = num2 + 1;
        // int num3 = num2++; // num3 = num2; num2 = num2 + 1;
        int num3 = ++num2;    //  num2 = num2 + 1; num3 = num2;
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        System.out.println("************");
        int num4 = 55;
       // System.out.println(--num4); //  num4 = num4 -1; print(num4);
        System.out.println(num4--);   //  print(num4); num4 = num4 -1;
        System.out.println(num4);

        System.out.println("--------------");
        int num6 = 50;
      //  double res = (double) num6/123;
        byte res = (byte) num6;
        byte num7 = 45;
        int num8 = num7;
        System.out.println(res);
    }
}
