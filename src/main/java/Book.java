/**
 * Represents a book with a title, author, and ISBN.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Book {
    private String title;
    private String author;
    private String ISBN; 

    /**
     * Constructs a Book with the given title, author, and ISBN.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN number of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    /** 
     * @return The title of the book. 
     */
    public String getTitle() {
        return title;
    }

    /** 
     * @return The author of the book. 
     */
    public String getAuthor() {
        return author;
    }

    /** 
     * @return The ISBN of the book. 
     */
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", ISBN: " + ISBN;
    }
}
