package arraylist;

import designpatterns.DBConnection;

public class Test123 {

    public void testConnection(){
        DBConnection dbObj = DBConnection.getConnection();
        System.out.println(dbObj);
    }
}
