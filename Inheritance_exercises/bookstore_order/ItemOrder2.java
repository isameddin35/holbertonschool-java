import products.Product2;

public class ItemOrder2 {
    private Product2 product;
    private int quantity;

    public ItemOrder2(Product2 product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product2 getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}