public class Order {
    private final double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double sumWODiscount = 0;
        double sum = 0;
        for (ItemOrder item : items) {
            sumWODiscount += item.getProduct().getNetPrice() * item.getQuantity();
            sum = sumWODiscount - (sumWODiscount * discountPercentage / 100);
        }
        return sum;
    }
}
