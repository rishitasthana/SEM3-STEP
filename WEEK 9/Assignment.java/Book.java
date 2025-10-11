import java.util.ArrayList;
import java.util.List;

class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Shallow clone is fine for Book (no nested objects)
    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class Library implements Cloneable {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    // Shallow clone: copies the reference to the books list
    @Override
    protected Library clone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    // Deep clone: clones the list and each Book object
    protected Library deepClone() throws CloneNotSupportedException {
        List<Book> clonedBooks = new ArrayList<>();
        for (Book b : books) {
            clonedBooks.add(b.clone());
        }
        return new Library(clonedBooks);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return books.toString();
    }
}

public class LibraryCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java", "Gosling"));
        bookList.add(new Book("C++", "Stroustrup"));

        Library lib1 = new Library(bookList);

        // Shallow clone
        Library lib2 = lib1.clone();

        // Deep clone
        Library lib3 = lib1.deepClone();

        // Modify a book in the shallow clone
        lib2.getBooks().get(0).setTitle("Advanced Java");

        // Modify a book in the deep clone
        lib3.getBooks().get(1).setTitle("Modern C++");

        System.out.println("Original Library: " + lib1);
        System.out.println("Shallow Cloned Library: " + lib2);
        System.out.println("Deep Cloned Library: " + lib3);
    }
}