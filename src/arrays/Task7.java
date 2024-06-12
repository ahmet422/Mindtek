package arrays;

public class Task7 {
    public static void main(String[] args) {
        char[] symbols = {'A','A','h','u','t','g'};
        // find if symbols arr has dup values
        boolean dupFound = false;
        for(int i = 0; i < symbols.length; i++){
            for(int j = i+1; j < symbols.length; j++){
                if(symbols[i]==symbols[j]){
                    dupFound = true;
                    break;
                }
            }
            if(dupFound) break;
        }

        if(dupFound) System.out.println("Dup found");
        else System.out.println("No dup found");
    }
}
