
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Bookkk {

    String title;
    String author;


    public Bookkk (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int hashCode() {
        return Objects.hash(this.title, this.author);
    }

    public boolean equals (Bookkk e) {
        return (this.title == e.title) && (this.author == e.author);
    }
}

class LinkedListSpeed {
    public static void main (String[] args) {

        LinkedList<Bookkk> bookList = new LinkedList<Bookkk>();
        HashMap <String, Bookkk> books = new HashMap <String, Bookkk>();

        Bookkk first = new Bookkk("Ksiega Dżungli", "Rudyard Kipling");
        Bookkk last = new Bookkk("50 Twarzy Greya", "E.L. James");

        String author = null;
        String title = null;
        String key = null;

        for (int n=0; n<100000; n++) {
            bookList.add(new Bookkk(title, author));
            books.put(key, new Bookkk(title, author));
        }

        System.out.println("Quantity of books in the collection: " + bookList.size()+ "\n");

        long begin = System.nanoTime();
        bookList.remove(last);
        long end = System.nanoTime();
        System.out.println("Time to delete last item: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.remove(first);
        end = System.nanoTime();
        System.out.println("Time to delete first item: " + (end - begin) + " ns" +"\n");

        long begin2 = System.nanoTime();
        bookList.add(new Bookkk(title, author));
        long end2 = System.nanoTime();
        System.out.println("Time to add last item: " + (end - begin) + "ns");

        begin2 = System.nanoTime();
        bookList.add(0, new Bookkk(title, author));
        end2 = System.nanoTime();
        System.out.println("Time to add first item: " + (end-begin) + "ns" + "\n");




        long begin3 = System.nanoTime();
        books.put(key, new Bookkk(title, author));
        long end3 = System.nanoTime();
        System.out.println("Time to add ithem to HashMap: " + (end-begin) + "ns");

        begin3 = System.nanoTime();
        books.remove(key, new Bookkk(title, author));
        end3 = System.nanoTime();
        System.out.println("Time to remove ithem from HashMap: " + (end-begin) + "ns");



    }
}