package arraylist3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {

        List<String> cards=new ArrayList<>();

        cards.add("Abc");
        Collections.addAll(cards,"VISA","Master Card","Discover","AMEX");
        cards.set(1,"VISA 123456789");

        System.out.println(cards);
        Collections.sort(cards);
        System.out.println(cards);

        Collections.reverse(cards);
        System.out.println(cards);

        Collections.shuffle(cards);
        System.out.println(cards);
    }

}
