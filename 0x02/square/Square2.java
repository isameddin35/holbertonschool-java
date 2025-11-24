public class Square2 {
    public static double area(double side) {
        double area = 0;
        if (side < 0) {
            throw new IllegalArgumentException("Side must have a positive value");
        } else {
            area = side * side;
        }
        return area;
    }
}
