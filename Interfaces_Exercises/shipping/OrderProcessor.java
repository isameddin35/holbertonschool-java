import providers.ShippingProvider;

public class OrderProcessor {
    private ShippingProvider shippingProvider;

    public OrderProcessor(ShippingProvider shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    public void process(Order111 order) {
        order.setShipping(shippingProvider.calculateShipping(order.getWeight(), order.getTotal()));
    }

}
