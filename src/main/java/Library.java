import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that contains a collection of books.
 * @author Kelly Fu
 * @version 17.0.1
 */

public class Library {
    private List<Book> books;

    /**
     * Constructs an empty Library.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book by ISBN.
     * @param isbn The ISBN of the book to remove.
     * @return true if the book was removed, false otherwise.
     */
    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getISBN().equals(isbn));
    }

    /**
     * Searches for books by title.
     * @param title The title to search for.
     * @return An array of books matching the title.
     */
    public Book[] searchBook(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    /**
     * Returns all books in the library.
     * @return An array of all books.
     */
    public Book[] displayBooks() {
        return books.toArray(new Book[0]);
    }
}
