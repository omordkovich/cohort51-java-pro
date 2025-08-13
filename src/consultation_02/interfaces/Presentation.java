package consultation_02.interfaces;

public class Presentation implements ColorPrintable{
   String title;
   String author;
   String thema;
   int amountPages;

    public Presentation(String title, String author, String thema, int amountPages) {
        this.title = title;
        this.author = author;
        this.thema = thema;
        this.amountPages = amountPages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Presentation in color by "  + author + "; title: " + title);
    }

    @Override
    public void print() {
        System.out.println("Presentation w/b by" + author + "; number of pages:" + amountPages);
    }
}
