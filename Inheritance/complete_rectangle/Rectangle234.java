public class Rectangle234 extends GeometricShape432 {
    private double width;
    private double height;

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "[Rectangle] " +
                width+ "0" +
                " / " + height + "0";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) throw new IllegalArgumentException("Width must be greater than or equal to 0");
        else this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) throw new IllegalArgumentException("Height must be greater than or equal to 0");
        else this.height = height;
    }
}
