package task;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int quantity) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getAuthorName() {
        return author.getName();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book[" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }
}
