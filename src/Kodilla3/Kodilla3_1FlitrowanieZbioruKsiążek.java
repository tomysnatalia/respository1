import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book4 {

    String title;
    String author;
    int publicationYear;

    public Book4 (String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int hashCode() {
        return publicationYear;
    }

    public boolean equals (Book4 e) {
        return (this.title == e.title) && (this.author == e.author) && (this.publicationYear == e.publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }
}

class BookList {
    public static void main (String[] args) {

        Book4 book1 = new Book4("Ksiega Dżungli", "Rudyard Kipling", 2001);
        Book4 book2 = new Book4("50 Twarzy Greya", "E.L. James", 2011);
        Book4 book3 = new Book4("Pan Tadeusz", "Adam Mickiwiecz",1999);

        HashSet<Book4> books = new HashSet<Book4>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book4 theBook : books) {
            if (theBook.getPublicationYear()  <= 2010) {
                System.out.println(theBook.title);
            }
        }
    }
}