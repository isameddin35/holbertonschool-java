public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidBookException {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InvalidAuthorException {

        int count = author.trim().split("\\s+").length;
        if (count < 2) {
            throw new InvalidAuthorException("Invalid author name");
        } else {
            this.author = author;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) throws InvalidBookException {
        if (price <= 0) {
            throw new InvalidBookException("Invalid book price");
        } else {
            this.price = price;
        }
    }
}