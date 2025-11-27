package providers;

public class DalseyHillblomLynn implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {

        Shipping shipping = new Shipping();
        shipping.setShippingProviderType(ShippingProviderType.DHL);

        if (weight > 5000) shipping.setValue(value * 12 / 100);
        else shipping.setValue(value * 4 / 100);
        return shipping;
    }
}
