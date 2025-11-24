public class Square1212 extends Rectangle1212 {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be greater than or equal to 0");
        } else {
            width = side;
            height = side;
            this.side = side;
        }
    }

    @Override
    public String toString() {
        return "[Square] " +
                side+ "0";
    }
}
