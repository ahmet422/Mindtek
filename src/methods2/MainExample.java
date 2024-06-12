package methods2;

public class MainExample {

    public static String[] getFirstNames(String[] fullNames){
        String[] names=new String[fullNames.length];
        for(int i=0; i<fullNames.length; i++){
            names[i]=fullNames[i].substring(0, fullNames[i].indexOf(' '));
        }
        return names;
    }

    public static StringBuilder getAllNames(String[] names){
        names=getFirstNames(names);
        StringBuilder stb=new StringBuilder();
        for(String name: names){
            stb.append(name).append(",\n");
        }
        return stb;
    }

    public static void main(String[] firstNames) {
        System.out.println(getAllNames(firstNames));
    }

}
