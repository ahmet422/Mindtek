package funationalinterfaces3;

import java.util.function.Function;

public class BuildInJavaFunInterfaces {

    public static void main(String[] args) {

        Function<Integer, Boolean> validAge= x -> x>=18;

        System.out.println(validAge.apply(20));

        Function<String, String> getInitials = x -> {
            char firstI=x.charAt(0);
            char lastI=x.charAt(x.indexOf(" ")+1);
            return ""+firstI+lastI;
        };

        System.out.println(getInitials.apply("John Doe"));
        System.out.println(getInitials.apply("Donkey Kong"));

        Function<Car, Boolean> isBrandNew=x -> x.getYear()==2024;

        Car car=new Car("Toyota",2023,"Black","SUV");

        System.out.println(isBrandNew.apply(car));

    }

}
