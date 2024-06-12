package stringbuilder;

public class StbPractice3 {

    public String removeDuplicateCharsEachWord(String str){
        String[] words=str.split(" ");
        StringBuilder stb=new StringBuilder();

        // Looping through each word in array
        for(int i=0; i< words.length; i++){
            StringBuilder word=new StringBuilder();
            // Looping through each character of word and storing unique chars
            for(int a=0; a<words[i].length(); a++){
                if(word.indexOf(words[i].substring(a,a+1))==-1){
                    word.append(words[i].charAt(a));
                }
            }
            stb.append(word).append(" ");
        }
        return stb.toString().trim();
    }

    public static void main(String[] args) {
        StbPractice3 methods=new StbPractice3();
        System.out.println(methods.removeDuplicateCharsEachWord("Java is my passion"));
        System.out.println(methods.removeDuplicateCharsEachWord(" Java is my passion "));
        System.out.println(methods.removeDuplicateCharsEachWord("Mom"));
    }

}
