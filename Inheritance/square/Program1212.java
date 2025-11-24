import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Program1212 {
    public static void main(String[] args) {
        Square1212 square = new Square1212();

        square.setSide(10);

        if (Rectangle1212.class.isAssignableFrom(Square1212.class))
            System.out.println("Square is a subclass of Rectangle");
        else
            System.out.println("Square is not a subclass of Rectangle");

        try {
            Field heightField = Rectangle1212.class.getDeclaredField("height");
            int changeHeight = heightField.getModifiers();
            System.out.printf("Field height is %s\n", Modifier.toString(changeHeight));

            Field widthField = Rectangle1212.class.getDeclaredField("width");
            int changeWidth = widthField.getModifiers();
            System.out.printf("Field width is %s\n", Modifier.toString(changeWidth));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.printf("Side: %.2f\n", square.getSide());
        System.out.printf("Area: %.2f\n", square.area());
        System.out.printf(square.toString() + "\n");
    }
}
