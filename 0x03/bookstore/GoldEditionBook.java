public class GoldEditionBook extends Book{

    GoldEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    public double getPrice() {
        return super.getPrice() + super.getPrice()/100*30;
    }
}