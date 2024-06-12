package arrays2;

public class Coins {

    public static void main(String[] args) {

        int[] coins={5,25,10,5,10,1,1,1,5};

        /*
        Quarters: 1
        Dimes: 2
        Nickels: 3
        Pennies: 3
         */

        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        double sum=0;

        for(int i=0; i<coins.length; i++){
            sum+=coins[i];
            if(coins[i]==25) quarters++;
            else if(coins[i]==10) dimes++;
            else if (coins[i]==5) nickels++;
            else if(coins[i]==1) pennies++;
        }

        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);

        System.out.println("Dollars: "+sum/100);

    }

}
