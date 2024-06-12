package arrays2;

public class FindCommonFruits {

    public static void main(String[] args) {

        String[] basket1={"Apple","Banana","Watermelon","Orange"};
        String[] basket2={"Melon","Orange","Kiwi","Apple","Watermelon"};

        // Apple, Orange
        for(int i=0; i<basket1.length; i++){
            for(int a=0; a<basket2.length; a++){
                if(basket1[i].equalsIgnoreCase(basket2[a])){
                    System.out.print(basket1[i]+", ");
                    break;
                }
            }
        }

    }

}
