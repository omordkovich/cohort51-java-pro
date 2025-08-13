package consultation_02.interfaces;

public class Book implements Printable, Recyclable {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book: %s (%s)\n", title, author);
    }

    public void bookClassMethod(){
        System.out.println("Method from class Book");
    }

    @Override
    public void printDefault() {
        System.out.println("Book override with Default method");
    }

    @Override
    public void recycle() {
        System.out.println("Book recycle");
    }
}
