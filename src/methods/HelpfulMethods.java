package methods;

public class HelpfulMethods {

    public double fehToCelsius(int fahrenheit){
        // (fahrenheit − 32) × 5/9
        return (fahrenheit-32) * 5.0/9; // 26.67 -> 26.67
    }

    public static void main(String[] args) {
        // Create object
        HelpfulMethods methods=new HelpfulMethods();

        System.out.println(methods.fehToCelsius(80));
        System.out.println(methods.lastTwoChars("Java"));
        System.out.println(methods.lastTwoChars("Programming"));
        System.out.println(methods.lastTwoChars("a"));

        System.out.println(methods.canEvenlyDivide(4,2));
        System.out.println(methods.canEvenlyDivide(9,5));

    }

    public String lastTwoChars(String str){
        if(str.length()>=2) {
            int index = str.length() - 2;
            return str.substring(index);
        }
        return null;
    }

    public boolean canEvenlyDivide(int num1, int num2){
        return num1%num2==0;
    }

}
