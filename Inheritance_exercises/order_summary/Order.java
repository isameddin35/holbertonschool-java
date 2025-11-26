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

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");
        for (ItemOrder item : items) {
            System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f%n",
                    item.getProduct().getClass().getSimpleName(),
                    item.getProduct().getTitle(),
                    item.getProduct().getNetPrice(),
                    item.getQuantity(),
                    item.getProduct().getNetPrice() * item.getQuantity()
            );
        }
        System.out.println("----------------------------");
        System.out.printf("DISCOUNT: %.2f%n", discountPercentage);
        System.out.printf("TOTAL PRODUCTS: %.2f%n", calculateTotal() + discountPercentage);
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f%n", calculateTotal());
        System.out.println("----------------------------");
    }
}
