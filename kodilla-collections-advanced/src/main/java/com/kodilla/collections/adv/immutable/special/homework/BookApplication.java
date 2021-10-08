package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {


        Book book4 = BookManager.createBook("To sie nigdy nie uda","Mark Randolph" );
        Book book1 = new Book("Pernament record", "Edward Snowden");
        BookManager.books.add(book1);
        Book book2 = new Book("Finding ultra", "Rich Roll");
        BookManager.books.add(book2);
        Book book3 = new Book("Finding ultra", "Rich Roll");
        BookManager.books.add(book3);

//Wyswietlamy liste ksiazek i rozmiar zbioru
        System.out.println("Ksiazki " + BookManager.books);
        System.out.println("rozmiar kolekcji to " + BookManager.books.size());

        //porownujemy ksiazki
        System.out.println("do they have the same values");
        System.out.println(book2.equals(book3));
        if (book2.equals(book3)) {
            System.out.println("Is this the same book?");
             System.out.println(book2 == book3);
        }
        }
    }
