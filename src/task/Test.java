package task;

public class Test {
    public static void main(String[] args) {
        Author author = new Author("MyAuthorsName","EmailOfAuthor");
        Book book = new Book("ISBN","MyBook",author,500,2);
        System.out.println(book);
    }
}
