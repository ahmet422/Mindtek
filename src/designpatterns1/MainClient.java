package designpatterns1;

public class MainClient {
    public static void main(String[] args) {
//        InfoParser infoParser = new InfoParser(); // expensive operation
//        infoParser.readData();
        InfoParserProxy infoParserProxy = new InfoParserProxy();
        infoParserProxy.readData();
        System.out.println("*****");
        infoParserProxy.readData();
        System.out.println("*****");
        infoParserProxy.readData();
    }
}
