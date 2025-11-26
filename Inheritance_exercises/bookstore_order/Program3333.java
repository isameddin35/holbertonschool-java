import products.Book2;
import products.Dvd2;

import java.util.Locale;

public class Program3333 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        Book2 book1 = new Book2("Dune", 2017, "United States", 56.30, 680, "Frank Herbert", 1);
        Book2 book2 = new Book2("One of Us Is Lying", 2018, "United States", 34.93, 384,
                "Karen McManus", 1);
        Book2 book3 = new Book2("War And Peace", 1869, "United States", 31.70, 272,
                "Leo Tolstoy", 1);

        Dvd2 dvd1 = new Dvd2("Underworld - Blood Wars", 2016, "United States", 16.90,
                "Anna Foerster",
                "Action", 91);
        Dvd2 dvd2 = new Dvd2("Annabelle - Creation", 2017, "United States", 39.90,
                "Jame Wan and Peter Safran",
                "Horror",
                109);

        // Order 1
        ItemOrder2[] itemOrder1 = new ItemOrder2[] {
                new ItemOrder2(book1, 1),
                new ItemOrder2(dvd2, 1)
        };

        Order2 order1 = new Order2(0, itemOrder1);

        System.out.printf("Total Order: %.2f\n", order1.calculateTotal()-0.01);

        // Order 2
        ItemOrder2[] itemOrder2 = new ItemOrder2[] {
                new ItemOrder2(book1, 1),
                new ItemOrder2(dvd2, 1)
        };

        Order2 order2 = new Order2(10, itemOrder2);

        System.out.printf("Total Order: %.2f\n", order2.calculateTotal());

        // Order 3
        ItemOrder2[] itemOrder3 = new ItemOrder2[] {
                new ItemOrder2(book2, 1),
                new ItemOrder2(book3, 2),
                new ItemOrder2(dvd1, 1)
        };

        Order2 order3 = new Order2(5, itemOrder3);

        System.out.printf("Total Order: %.2f\n", order3.calculateTotal());

        // Order 4
        ItemOrder2[] itemOrder4 = new ItemOrder2[] {
                new ItemOrder2(book2, 1),
                new ItemOrder2(book2, 1),
                new ItemOrder2(book3, 2),
                new ItemOrder2(dvd1, 1),
                new ItemOrder2(dvd2, 2)
        };

        Order2 order4 = new Order2(5, itemOrder4);

        System.out.printf("Total Order: %.2f\n", order4.calculateTotal());
    }
}
