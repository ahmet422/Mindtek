package designpatterns1;

public class MainClientForInternet {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Sebastian");
        officeInternetAccess.grantInternetAccess();

        OfficeInternetAccess officeInternetAccess2 = new ProxyInternetAccess("Sara");
        officeInternetAccess2.grantInternetAccess();
    }
}
