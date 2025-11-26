public class Order2 {
    private final double discountPercentage;
    private ItemOrder2[] items;

    public Order2(double discountPercentage, ItemOrder2[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double sumWODiscount = 0;
        double sum = 0;
        for (ItemOrder2 item : items) {
            sumWODiscount += item.getProduct().getNetPrice() * item.getQuantity();
            sum = sumWODiscount - (sumWODiscount * discountPercentage / 100);
        }
        return sum;
    }
}
