package products;

public class Book2 extends Product2 {
    private int pages;
    private String author;
    private int edition;


    public Book2(String title, int year, String country, double grossPrice, int pages, String author, int edition) {
        super(title, year, country, grossPrice);
        this.pages = pages;
        this.author = author;
        this.edition = edition;

    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() + (getGrossPrice() * 15 / 100);
    }
}
