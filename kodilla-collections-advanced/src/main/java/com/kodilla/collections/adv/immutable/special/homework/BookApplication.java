package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

Book book1 = BookManager.createBook("To sie nigdy nie uda","Mark Randolph" );
Book book2 = BookManager.createBook("Pernament record", "Edward Snowden");
Book book3 = BookManager.createBook("Finding ultra", "Rich Roll");
Book book4 = BookManager.createBook("Shoe dog", "Phil Knight");

         System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book2 == book3);
        System.out.println(book3 == book4);
    }
}
