public class Program234 {
    public static void main(String[] args) {
        Rectangle234 rectangle = new Rectangle234();
        rectangle.setWidth(7);
        rectangle.setHeight(4);

        System.out.printf("Area: %.2f\n", rectangle.area());
        System.out.println(rectangle.toString());
    }
}
