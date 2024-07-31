package designpatterns1;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String empName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String empName) {
        this.empName = empName;
    }

    public int getRole(String empName){
        // look up to db and find role of empName
        if(empName.length()>5) return 7;
        else return 3;
    }
    @Override
    public void grantInternetAccess() {
        // grant access only for people with role > 5
        if(getRole(empName) > 5) {
            realInternetAccess = new RealInternetAccess(empName);
            realInternetAccess.grantInternetAccess();
        }else System.out.println("Sorry no internet for you! " + empName);
    }

}
