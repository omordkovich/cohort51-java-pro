package consultation_02.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Философия Java", "Б.Эккель");

        Printable printable = new Book("Мастер и Маргарита", "Булгаков");

        book.print();
        printable.print();

        book.bookClassMethod();

        List<Book> books = new LinkedList<>();
        books = new ArrayList<>();

        Presentation presentation = new Presentation(
                "Inheritence",
                "Noname",
                "Inharitance in OP",
                20

        );
        presentation.print();
        presentation.colorPrint();

        printable.printDefault();
        book.printDefault();

        Printable[] printables = {book, presentation};
        printables[0].print();
        printables[1].print();

        Printable.staticMethod();

        System.out.println(Arrays.toString(Printable.numbers));
        Printable.numbers[2] = 100;
        System.out.println(Arrays.toString(Printable.numbers));

        book.recycle();
        if (printable instanceof Recyclable) {
            Recyclable recyclable = (Recyclable) printable;
            System.out.println("Смог перевести");
            recyclable.recycle();
        } else {
            System.out.println("Презентацию нельзя привести к типу Recyclable");
        }

    }
}
