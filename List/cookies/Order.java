import java.util.List;

public class Order {
    private List<CookieOrder> cookies;

    public Order() {
    }

    public Order(List<CookieOrder> cookies) {
        this.cookies = cookies;
    }

    public void addCookieOrder(CookieOrder order) {
        cookies.add(order);
    }

    public int getTotalBoxes() {
        int totalBoxes = 0;
        for (CookieOrder order : cookies) {
            totalBoxes += order.getBoxQuantity();
        }
        return totalBoxes;
    }

    public int removeFlavor(String flavor) {
        int removedBoxQuantity = 0;
        for (CookieOrder order : cookies) {
            if (order.getFlavor().equals(flavor)) {
                cookies.remove(order);
                removedBoxQuantity += order.getBoxQuantity();
            }
        }
        return removedBoxQuantity;
    }
}
