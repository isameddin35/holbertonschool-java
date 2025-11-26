package products;

public class Dvd2 extends Product2 {
    private String director;
    private String genre;
    private int duration;

    public Dvd2(String title, int year, String country, double grossPrice, String director, String genre, int duration) {
        super(title, year, country, grossPrice);
        this.director = director;
        this.genre = genre;
        this.duration = duration;


    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() + (getGrossPrice() / 5);
    }
}
