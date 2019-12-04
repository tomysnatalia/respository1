import java.util.*;
import java.lang.*;
import java.io.*;

class Book2 {

    String title;
    int publicationDate;

    public Book2 (String title, int publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }
}

class Lists {
    public static void main (String[] args) {

        Book2 one = new Book2("Ksiega Dżungli", 2001);

        Book2 two = new Book2("50 Twarzy Greya", 2011);

        Book2 three = new Book2("Pan Tadeusz", 1999);

        LinkedList<Book2> theBook = new LinkedList<Book2>();
        theBook.add(one);
        theBook.add(two);
        theBook.add(three);

        for ( Book2 books : theBook) {
            if ( books.publicationDate > 2000) {
                System.out.println(books.title);
            }
        }

        ArrayList<Integer> informatics = new ArrayList<>();

        informatics.add(5);
        informatics.add(4);
        informatics.add(5);
        informatics.add(6);
        informatics.add(5);

        double sum = 0;
        double averge = 0;

        Collections.sort(informatics);

        informatics.remove(informatics.size()-1);
        informatics.remove(0);

        for(Integer i=0; i<informatics.size(); i++) {


            sum += informatics.get(i);

        }
        averge = sum / informatics.size();

        System.out.println(sum);
        System.out.println("Averge = " + averge);

    }
}