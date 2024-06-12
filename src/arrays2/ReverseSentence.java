package arrays2;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence="I love Java";

        // Java love I

        String reversed="";

        // words={"I", "love", "Java"};
        String[] words=sentence.split(" ");

        for(int i=words.length-1; i>=0; i--){
            reversed=reversed+words[i]+" ";
        }

        System.out.println(reversed.trim());

    }
}
