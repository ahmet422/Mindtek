package conditions;

public class ForLoopIntro {
    public static void main(String[] args) {
        // print nums from 1 to 10
//        int i = 1; // start point = 1
//        while(i <= 10) { // finish when i = 10
//            System.out.println(i);
//            i++; // inc logic
//        }
        // for(start; condition; inc logic){ code }
        for(int i = 1; i <= 10; i++){
            if(i<5) continue;
            System.out.println(i);
            if(i==7) break;
        }
    }
}
