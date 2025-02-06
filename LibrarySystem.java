
// Problem 1: Library and Books (Aggregation)
// Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
// Tasks:
// Define a Library class with an ArrayList of Book objects.
// Define a Book class with attributes such as title and author.
// Demonstrate the aggregation relationship by creating books and adding them to different libraries.
// Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects

import java.util.ArrayList;

class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;

    }
    public void BookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class Library{
    ArrayList<Book> books;
    String libraryName;
    Library(String libraryName){
        this.libraryName=libraryName;
        books = new ArrayList<>();
        }
         
        public void addBooks(Book book){
            books.add(book);
        }
        public void displayBook(){
            for(Book book:books){
                    book.BookDetails();
            }
        }
}

public class LibrarySystem {
    public static void main(String[] args) {
        
    
    Book b1=new Book("harry", "guzzar");
    Book b2=new Book("potter", "gaurav");
    b1.BookDetails();
    b2.BookDetails();
    Library l1=new Library("internation library");
    l1.addBooks(b1);
    l1.addBooks(b2);
    l1.displayBook();


    }
}
