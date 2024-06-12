package stringbuilder;

public class RemoveDuplicates {

    /*
    .removeDuplicateChars("Hello"); -> return "Helo"
    .removeDuplicateChars("Java"); -> return "Jav"
     */

    public String removeDuplicateChars(String str){
        StringBuilder stb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals(" ") || stb.indexOf(str.substring(i,i+1))==-1){
                stb.append(str.charAt(i));
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates methods=new RemoveDuplicates();
        System.out.println(methods.removeDuplicateChars("Hello World"));
        System.out.println(methods.removeDuplicateChars("Java is my passion"));
    }

}
