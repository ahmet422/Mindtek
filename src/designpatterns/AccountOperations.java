package designpatterns;

public class AccountOperations {
    DBConnection obj = DBConnection.getConnection();

    public void createAcc(){
        obj.create();
    }
    public void deleteAcc(){
        obj.delete();
    }
    // updateAcc(){}
}
