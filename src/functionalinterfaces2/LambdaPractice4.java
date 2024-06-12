package functionalinterfaces2;

public class LambdaPractice4 {

    public static void main(String[] args) {

        Checker<Integer, Integer> sum= x -> {
            Integer total=0;
            for(Integer num: x){
                total+=num;
            }
            return total;
        };

        Integer[] nums={5,2,6};

        System.out.println(sum.execute(nums));

        Checker<Integer, Boolean> sumMoreThan20 = x -> sum.execute(x)>20;

        System.out.println(sumMoreThan20.execute(nums));

        /*
        Implement lambda expression for checker that takes
        array of String as parameters and returns all elements concatenated.
        Example:
            String[] words={"I", "love", "Java"};
            concatenate.execute(words); -> return "I love Java";
         */

        Checker<String, String> concatenate = x -> {
            StringBuilder stb=new StringBuilder();
            for(String s: x){
                stb.append(s).append(" ");
            }
            return stb.toString().trim();
        };
        String[] words={"I", "love", "Java"};

        System.out.println(concatenate.execute(words));

        /*
        String[] prices={"$2.4", "$5.2", "$3"};
        Example:
            getTotal.execute(prices); -> return 10.6; double
         */
        Checker<String, Double> getTotal= x -> {
            Double total=0.0;
            for(String price: x){
                Double p= Double.valueOf( price.substring(1) );
                total+=p;
            }
            return total;
        };

        String[] prices={"$2.4","$5.2","$3"};

        System.out.println(getTotal.execute(prices));

    }

}
