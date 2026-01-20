package oop;

public class Book {
    String title;
    String author;
    int price;
    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Book's Title: " + title);
        System.out.println("Book's Author: " + author);
        System.out.println("Book's Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("long journey","yash",200);
        b1.displayDetails();
    }
}
