package designpatterns;

import arraylist.Test123;

public class TestSingleton {
    public static void main(String[] args) {

        Logging obj1 = Logging.getInstance();
        Logging obj2 = Logging.getInstance();
        Logging obj3 = Logging.getInstance();
        Logging obj4 = Logging.getInstance();
        Logging obj5 = Logging.getInstance();
        Logging obj6 = Logging.getInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        DBConnection dbObj = DBConnection.getConnection();
        System.out.println(dbObj);

        Test123 test123 = new Test123();
        test123.testConnection();

    }
}

//Singleton Pattern says that just
//"define a class that provides only one instance and " +
//        "provides a global point of access to it".
//
//In other words, a class must ensure that only single
//        instance should be created and single object
//        can be used by all other classes.

//