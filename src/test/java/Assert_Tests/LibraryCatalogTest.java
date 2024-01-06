package Assert_Tests;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import bookAndCatalog.Book;
import bookAndCatalog.LibraryCatalog;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class LibraryCatalogTest {

    private LibraryCatalog libraryCatalog;

    @Before
    public void setUp() {
        libraryCatalog = new LibraryCatalog();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        libraryCatalog.addBook(book);

        List<Book> books = libraryCatalog.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryCatalog.addBook(book);

        libraryCatalog.borrowBook("To Kill a Mockingbird");

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("1984", "George Orwell");
        libraryCatalog.addBook(book);

        book.setAvailable(false);
        libraryCatalog.returnBook("1984");

        assertTrue(book.isAvailable());
    }
}
