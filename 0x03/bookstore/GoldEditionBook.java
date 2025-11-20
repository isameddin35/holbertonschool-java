import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class GoldEditionBook extends Book{

    GoldEditionBook(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
        super(title, author, price);
    }

    public double getPrice() {
        return super.getPrice() + super.getPrice()/100*30;
    }
}