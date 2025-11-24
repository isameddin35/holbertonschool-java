public class Program555 {
    public static void main(String[] args) {
        GeometricShape1 geometricShape = new GeometricShape1();

        try {
            System.out.printf("Area: %d", geometricShape.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
