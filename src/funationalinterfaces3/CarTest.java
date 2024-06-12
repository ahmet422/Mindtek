package funationalinterfaces3;

import java.util.List;
import java.util.Objects;

public class CarTest {

    public static void main(String[] args) {

        Car car1=new Car("Toyota",2020, "White","Sedan");
        Car car2=new Car("Honda",2024, "Red","SUV");
        Car car3=new Car("Mercedes",2022, "Black","Sedan");
        Car car4=new Car("BMW",2018, "Silver","SUV");
        Car car5=new Car("Chevrolet",2015, "Blue","SUV");

        List<Car> cars= List.of(car1,car2,car3,car4,car5);

        /*
        Get cars models that is 2020 and newer.
         */

//        for(Car c: cars){
//            if(c.getYear()>=2020){
//                System.out.println(c.getModel());
//            }
//        }

        getDataFromCars(cars, x -> x.getYear()>=2020, Car::getModel);

        // x -> x.getModel();    |     Car::getModel

        /*
        Get colors of SUV cars
         */
//        for(Car c: cars){
//            if(c.getType().equals("SUV")){
//                System.out.println(c.getColor());
//            }
//        }

        getDataFromCars(cars, car -> car.getType().equals("SUV"), Car::getColor );

        System.out.println("==============");
        // Get years of Sedan cars

        getDataFromCars(cars, car -> car.getType().equals("Sedan"), Car::getYear );

        // Print first 3 letters of Models in uppercase of SUV cars that are having even number as a year.
        System.out.println("===============");
        getDataFromCars(cars, x -> x.getYear()%2==0 && x.getType().equals("SUV"), x -> x.getModel().substring(0,3).toUpperCase());

        // Count SUV cars
        System.out.println("Number of SUV cars: "+getCountOfCars(cars, x -> x.getType().equals("SUV")));
        // Count Sedan cars
        System.out.println("number of Sedan cars: "+getCountOfCars(cars, x -> x.getType().equals("Sedan")));
        // Count black cars
        System.out.println("Number of Black cars: "+getCountOfCars(cars, x -> x.getColor().equals("Black")));

    }

    public static int getCountOfCars(List<Car> cars, CarCondition condition) {
        int count=0;
        for(Car c: cars) {
            if(condition.apply(c)){
                count++;
            }
        }
        return count;
    }

    public static void getDataFromCars(List<Car> cars, CarCondition condition, AttributeFunction<Object> function){
        for(Car c: cars) {
            if(condition.apply(c)){
                System.out.println(function.get(c));
            }
        }
    }

}
