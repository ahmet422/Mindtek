package methods2;

public class InvestmentApp {

    public static int getProfit(int amount, int years, int rate){
        return amount*years*rate/100;
    }

    public static int getTotalWithProfit(int amount, int years, int rate){
        return getProfit(amount, years, rate) + amount;
    }

    public static void main(String[] args) {
        System.out.println(getTotalWithProfit(100,5,4));
    }

}
