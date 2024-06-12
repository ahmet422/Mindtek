package stringbuilder;

public class StbMethods {

    public static void main(String[] args) {

        StringBuilder stb=new StringBuilder("Computer");

        // Computer -> Apple Computer
        stb.insert(0, "Apple ");
        System.out.println(stb);

        // Apple Computer -> Apple - Computer
        stb.insert(6,"- ");
        System.out.println(stb);

        stb.reverse();
        System.out.println(stb);

        stb.reverse();

        // Apple - Computer -> Apple Computer
        stb.deleteCharAt(6);
        System.out.println(stb);

        // Apple  Computer -> Computer
        stb.delete(0,7);
        System.out.println(stb);

        // Computer -> computer
        stb.replace(0,1,"c");
        System.out.println(stb);

    }

}
