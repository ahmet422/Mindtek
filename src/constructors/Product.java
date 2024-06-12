package constructors;

public class Product {

    String picture;
    String name;
    int rate;
    double price;
    boolean isFreeShipping;
    String department;
    static int count;

    public Product(String picture, String name, int rate, double price, boolean isFreeShipping, String department) {
        this.picture = picture;
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.isFreeShipping = isFreeShipping;
        this.department = department;
        count++;
    }

    public Product(String name, int rate, double price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        count++;
    }

    public String toString(){
        return "name: "+name+", rate: "+rate+", price: "+price;
    }

}
