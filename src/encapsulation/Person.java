package encapsulation;

public class Person {

    private String name;
    private int age;
    private char gender;
    private boolean isAdult;

    public void setName(String name){
        if(name.length()>=3){
            this.name=name;
        }else{
            System.out.println("Invalid name");
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=0)
            this.age=age;
        else
            System.out.println("Invalid age");
    }

    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        if(gender=='M' || gender=='F')
            this.gender=gender;
        else
            System.out.println("Invalid gender");
    }

    public char getGender(){
        return gender;
    }

    public void setAdult(boolean isAdult){
        this.isAdult=isAdult;
    }

    public boolean getAdult(){
        return isAdult;
    }

}
