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
import java.util.ArrayList;

public class Library {

    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
    
    // using hash map's keySet() method
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);
        
        ArrayList<Book> books = new ArrayList<>();
        
        for (String bookTitle : this.directory.keySet()) {
            if (!bookTitle.contains(titlePart)) {
                continue;
            }
            
            // if the key contains the given string
            // we retrieve the value related to it
            // and add it to the set of books to be returned
            
            books.add(this.directory.get(bookTitle));
        }
        
        return books;
    }
    
    // using hash map's values() method
    public ArrayList<Book> getBookByPartValues(String titlePart) {
        titlePart = sanitizedString(titlePart);
        
        ArrayList<Book> books = new ArrayList<>();
        
        for (Book book : this.directory.values()) {
            if (!book.getName().contains(titlePart)) {
                continue;
            }
            
            books.add(book);
        }
        
        return books;
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
