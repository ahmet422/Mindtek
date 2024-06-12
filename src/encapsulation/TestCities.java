package encapsulation;

public class TestCities {

    public static void main(String[] args) {

        Country country1=new Country("USA","North America",333);
        Country country2=new Country("Germany","Europe",83);
        Country country3=new Country("China","Asia",1412);

        City city1=new City("New York",8,country1);
        City city2=new City("Los Angeles",3,country1);
        City city3=new City("Berlin",3,country2);
        City city4=new City("Shanghai",26,country3);
        City city5=new City("Beijing",21,country3);

        City[] cities={city1,city2,city3,city4,city5};

        System.out.println(TestCities.getPopulation(cities,"USA"));
        System.out.println(getPopulation(cities,"China"));
        System.out.println(getPopulation(cities,"Germany"));
        System.out.println(getPopulation(cities,"France"));

        System.out.println(getCities(cities,"North America"));
        System.out.println(getCities(cities,"Asia"));

    }

    /*
    Write a method that takes array of cities and Country name as parameters
    and methods returns total population of cities of that country.
    Example:
        .getPopulation(cities,"USA"); -> return 11;
     */
    public static int getPopulation(City[] cities, String country){
        int totalPopulation=0;
        for (City c : cities){
            if(c.getCountry().getName().equalsIgnoreCase(country))
                totalPopulation+=c.getPopulation();
        }
        return totalPopulation;
    }

    /**
     * Write a method that will take region and cities as parameters
     * and return city names that located in that region.
     *
     * Ex:
     *      .getCities(cities, "North America"); -> "New York, Los Angeles"
     */
    public static String getCities(City[] cities, String region){
        String output="";
        for(City c: cities){
            if(c.getCountry().getRegion().equalsIgnoreCase(region)){
                output+=c.getName()+", ";
            }
        }
        return output.substring(0,output.length()-2);
    }


}


















