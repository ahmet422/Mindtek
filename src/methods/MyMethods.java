package methods;

public class MyMethods {

    public boolean firstAndLastEquals(String str){
        if(str!=null && str.length()>0){
            return str.toLowerCase().charAt(0) == str.toLowerCase().charAt(str.length()-1);
        }
        return false;
    }

    public static void main(String[] args) {
        MyMethods methods=new MyMethods();
        System.out.println(methods.firstAndLastEquals("Java"));
        System.out.println(methods.firstAndLastEquals("Anna"));
        System.out.println(methods.firstAndLastEquals("w"));
        System.out.println(methods.firstAndLastEquals(""));
        System.out.println(methods.firstAndLastEquals(null));
    }

}
