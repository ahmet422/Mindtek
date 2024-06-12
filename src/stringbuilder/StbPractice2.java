package stringbuilder;

public class StbPractice2 {

    public static void main(String[] args) {

        StringBuilder email=new StringBuilder("Hi John,");
        email.append("I will be on leave next week.");
        email.append("\nWould you approve my PTO between May 1 and May 7").append("\nBest regards,").append("\nPatel Harsh");

        System.out.println(email);

    }

}
