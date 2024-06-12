package oop.inheritance.companies;

public class Company {

    String name;
    int employees;

    public String serving(){
        return name+" is serving";
    }

    protected Object isHiring(){
        return false;
    }

}
