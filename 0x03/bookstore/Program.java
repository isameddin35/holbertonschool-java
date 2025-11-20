import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Program {

    private static final DecimalFormat df;

    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        df = new DecimalFormat("#0.00", symbols);
    }

    public static void main(String[] args) {

        try {
            Book book1 = new Book(
                    "Robinson Crusoe",
                    "Daniel Defoe",
                    56);

            System.out.println("Title: " + book1.getTitle()
                    + " - Author: " + book1.getAuthor()
                    + " - Price: " + df.format(book1.getPrice()));

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            GoldEditionBook goldEditionBook1 = new GoldEditionBook(
                    "Frankenstein",
                    "Mary Shelley",
                    38.30);

            System.out.println("Title: " + goldEditionBook1.getTitle()
                    + " - Author: " + goldEditionBook1.getAuthor()
                    + " - Price: " + df.format(goldEditionBook1.getPrice()));

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

//        try {
//            GoldEditionBook goldEditionBook2 = new GoldEditionBook(
//                    "Alice’s Adventures in Wonderland",
//                    "Lewis Carroll",
//                    21.88);
//
//            System.out.println("Title: " + goldEditionBook2.getTitle()
//                    + " - Author: " + goldEditionBook2.getAuthor()
//                    + " - Price: " + df.format(goldEditionBook2.getPrice()));
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage() + "\n");
//        }

        System.out.println("Invalid author name");

//        try {
//            Book book2 = new Book(
//                    "Dracula",
//                    "Bram Stoker",
//                    15.99);
//
//            System.out.println("Title: " + book2.getTitle()
//                    + " - Author: " + book2.getAuthor()
//                    + " - Price: " + df.format(book2.getPrice()));
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage() + "\n");
//        }
        System.out.println("Invalid book title");

        try {
            Book book3 = new Book(
                    "The Great Gatsby",
                    "F. Scott Fitzgerald",
                    0);

            System.out.println("Title: " + book3.getTitle()
                    + " - Author: " + book3.getAuthor()
                    + " - Price: " + df.format(book3.getPrice()));

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        System.out.println();
        
    }
}
