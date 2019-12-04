import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return " title: \"" +  title + "\", author: " + author;
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}

class Order{
    Book book;
    LocalDate dateOfOrder;
    int orderNumber;

    public Order(Book book, int year, int month, int day, int orderNumber){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
        this.orderNumber = orderNumber;
    }

    public int hashCode() {
        return orderNumber;
    }

    public boolean equals (Order e) {
        return (this.book == e.book) && (this.dateOfOrder == e.dateOfOrder) && (this.orderNumber == e.orderNumber);
    }

    public String toString(){
        return " order number (" + orderNumber + ")" + " day of order:  " + dateOfOrder + book;
    }

    public Book getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }

    public int getOrderNumber(){
        return orderNumber;
    }
}

class BookOrders {

    public static void main (String[] args) {

        Book book1 = new Book("Ksiega Dżungli", "Rudyard Kipling");
        Book book2 = new Book("50 Twarzy Greya", "E.L. James");
        Book book3 = new Book("Pan Tadeusz", "Adam Mickiwiecz");

        Order order1 = new Order(book1, 2019,11,20, 5522);
        Order order2 = new Order(book2, 2019,11,25, 5523);
        Order order3 = new Order(book3, 2019,11,24, 5524);
        Order order4 = new Order(book2, 2019,11,28, 5525);


        ArrayDeque<Order> orders = new ArrayDeque<Order>();
        orders.offer(order1);
        orders.offer(order2);
        orders.offer(order3);
        orders.offer(order4);


        System.out.println("Orders in the queue:" + orders.size() + "\n");

        System.out.println("First order to sent: " + orders.peek());

        Order implemented;
        implemented = orders.poll();
        implemented = orders.poll();
        implemented = orders.poll();
        implemented = orders.poll();

        System.out.println("Last order sent: " + implemented+"\n");
        System.out.println("Orders in the queue: " + orders.size());
    }
}

