package funationalinterfaces3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        Consumer<Car> printCarModel = x -> System.out.println(x.getModel());

        Car car = new Car("Lamborghini", 2025, "Blue", "Sedan");

        printCarModel.accept(car);

        BiConsumer<String, Integer> concatenate= (x,y) -> System.out.println(x+y);

        concatenate.accept("Java",21);

    }

}
