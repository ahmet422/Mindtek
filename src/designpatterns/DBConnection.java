package designpatterns;

public class DBConnection {
    private static DBConnection obj;

    private DBConnection(){};

    public static DBConnection getConnection(){
        if(obj==null) obj = new DBConnection();
        return obj;
    }

    public void create(){
        System.out.println("db create operation is running");
    }
    public void delete(){
        System.out.println("db delete operation is running");
    }
    public void update(){
        System.out.println("db update operation is running");
    }
}
