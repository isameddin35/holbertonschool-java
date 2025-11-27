package providers;

public class UnitedParcelService implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {

        Shipping shipping = new Shipping();
        shipping.setShippingProviderType(ShippingProviderType.UPS);

        if (weight > 2000) shipping.setValue(value * 7 / 100);
        else shipping.setValue(value * 4.5 / 100);
        return shipping;
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return null;
    }
}
