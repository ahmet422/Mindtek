package arrays2;

public class NameToEmail {

    public static void main(String[] args) {

        String[] names={"John Doe", "Patel Harsh", "Kim Yan", "Brat Pitt"};

        /*
        John Doe -> john.d@mindtek.io
        Patel Harsh -> patel.h@mindtek.io
        Kim Yan -> kim.y@mindtek.io
        Brat Pitt -> brat.p@mindtek.io
         */

        for(int i=0; i<names.length; i++){
            // name="Patel Harsh"
            String name=names[i].toLowerCase();
            // firstLastName={"patel","harsh"};
            String[] firstLastName=name.split(" ");
            //              patel           .   h                         @mindtek.io
            String email=firstLastName[0]+"."+firstLastName[1].charAt(0)+"@mindtek.io";
            System.out.println(email);
        }

    }

}
