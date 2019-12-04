import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Bookk{
    String title;
    String author;
    int year;

    public Bookk(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}


class BookDeque {
    public static void main (String[] args) {

        Bookk book1 = new Bookk("Ksiega Dżungli", "Rudyard Kipling", 2001);
        Bookk book2 = new Bookk("50 Twarzy Greya", "E.L. James", 2011);
        Bookk book3 = new Bookk("Pan Tadeusz", "Adam Mickiwiecz",1999);
        Bookk book4 = new Bookk("Kasacja", "Remigiusz Mróz",2015);
        Bookk book5 = new Bookk("Enklawa", "Remigiusz Mróz",2016);


        ArrayDeque<Bookk> theBook = new ArrayDeque<Bookk>();

        theBook.push(book1);
        theBook.push(book2);
        theBook.push(book3);
        theBook.push(book4);
        theBook.push(book5);

        System.out.println("Queue size: " + theBook.size());

        Bookk booksRemoving;
        booksRemoving = theBook.pop();

        booksRemoving = theBook.pop();
        booksRemoving = theBook.pop();
        booksRemoving = theBook.pop();
        booksRemoving = theBook.pop();


        System.out.println("Queue size after removing: " + theBook.size());
        System.out.println();
        System.out.println("Last book taken was:\n" + booksRemoving);


    }
}