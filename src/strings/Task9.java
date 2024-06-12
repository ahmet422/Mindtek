package strings;

public class Task9 {
    public static void main(String[] args) {
        // assume that we capture fullname of a person from some console
        String fullName = "Jack Smith"; // "Brad Hemingway", "Steve Peterson"
        // task: print firstName and lastName separately
        System.out.println("first name: " + fullName.substring(0,fullName.indexOf(' ')));
        System.out.println("last name: " + fullName.substring(fullName.indexOf(" ")).trim());
    }
}
