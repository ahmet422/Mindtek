package objects;

public class Employee {

    String name;
    int id;
    boolean isRemote;
    char gender;

    public String work(){
        return name+" is working";
    }

    // CONSTRUCTOR
    public Employee(String name,int id,boolean isRemote, char gender){
        this.name=name;
        this.id=id;
        this.isRemote=isRemote;
        this.gender=gender;
    }

    public  Employee(){}

}
