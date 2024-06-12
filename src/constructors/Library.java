package constructors;

public class Library {

    public static void main(String[] args) {

        Book book1=new Book("OCA",500,"James Boyarsky");
        Book book2=new Book("10x Rules",100,"Grand Cardone");
        Book book3=new Book("War & Peace");
        Book book4=new Book(250);
        Book book5=new Book();

        Book[] books={book1,book2,book3,book4,book5};

        for(Book b : books){
            if(b.pages>200) System.out.println(b.title);
        }

        System.out.println("================");
        // Print authors that has book title as null

        for(Book b: books){
            if(b.title==null) System.out.println(b.author);
        }

        // Print total pages for all books that has Title

        int total=0;
        for(Book b: books){
            if(b.title!=null) total+=b.pages;
        }

        System.out.println("Total of pages: "+total);

    }

}
