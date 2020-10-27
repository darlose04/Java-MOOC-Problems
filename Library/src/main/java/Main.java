/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

//        HashMap<String, Book> directory = new HashMap<>();
//
//        directory.put(senseAndSensibility.getName(), senseAndSensibility);
//        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
//
//        Book book = directory.get("Persuasion");
//        System.out.println(book);
//        System.out.println();
//        book = directory.get("Pride and Prejudice");
//        System.out.println(book);
//        Library library = new Library();
//        library.addBook(senseAndSensibility);
//        library.addBook(prideAndPrejudice);
//        
//        System.out.println(library.getBook("pride and prejudice"));
//        System.out.println();
//        
//        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
//        System.out.println();
//        
//        System.out.println(library.getBook("SENSE"));
//        Book bookObject = new Book("Book Object", 2000, "...");
//        Book anotherBookObject = new Book("Book Object", 2000, "...");
//
//        if (bookObject.equals(anotherBookObject)) {
//            System.out.println("The books are the same");
//        } else {
//            System.out.println("The books aren't the same");
//        }

        HashMap<Book, String> borrowers = new HashMap<>();
        
        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");
        
        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...")));
    }
}
