package wrapperclasses;

public class GetTotal {

    public static void main(String[] args) {

        String[] prices={"$25.4", "$3.25", "$7.10"};
        String total="$35.75";

        // Write a code that will if total is correctly calculated

        double sum=0;

        for(int i=0; i<prices.length; i++){
            String price=prices[i].substring(1);
            double priceDouble=Double.parseDouble(price);
            sum+=priceDouble;
        }

        System.out.println("Total was calculated correctly: "+total.equals("$"+sum));


    }

}
