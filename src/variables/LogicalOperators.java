package variables;

public class LogicalOperators {
    public static void main(String[] args) {
        // AND -> &&
        boolean isGreen = true;
        boolean noOneIsCrossing = false;
        boolean carIsRunning = true;
        boolean canStartDriving = isGreen && noOneIsCrossing && carIsRunning;

        if(canStartDriving)
            System.out.println("Press the gas pedal");
        else System.out.println("Wait!");


        // OR -> ||
        // buy oranges AND apples -> buy 2 products
        // buy oranges OR apples  -> buy 1 product
        System.out.println("Book club for people with age between 25-35!"); // age >= 25  OR  age <= 35
        int age = 30;
        boolean validAge = age>=25 && age<=35;
        if(validAge) System.out.println("You can apply");
        else System.out.println("Your age is not in a range of 25-35");

        System.out.println("Teenager Female Book club"); // age 13<=age<=20 and Female  age>=13 && age<=19 && gender==1


    }
}
