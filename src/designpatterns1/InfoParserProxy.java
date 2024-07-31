package designpatterns1;

public class InfoParserProxy implements InfoParserInterface{
    private InfoParser infoParser;

    @Override
    public void readData() {
        if(infoParser==null) infoParser = new InfoParser();
        infoParser.readData();
    }
}
