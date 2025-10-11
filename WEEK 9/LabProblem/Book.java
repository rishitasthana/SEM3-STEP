class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override equals() to compare title and author
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Java Programming", "James Gosling");
        Book b3 = b1;

        // Reference comparison
        System.out.println("b1 == b2: " + (b1 == b2)); // false
        System.out.println("b1 == b3: " + (b1 == b3)); // true

        // Content comparison
        System.out.println("b1.equals(b2): " + b1.equals(b2)); // true
        System.out.println("b1.equals(b3): " + b1.equals(b3)); // true
    }
}