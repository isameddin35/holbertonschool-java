public class Number {
    public static void todivide(int a, int b) {
        int qismet = 0;
        try {
            qismet = a / b;
        } catch (Exception e) {
            System.out.println("It's not possible to divide by zero.");
        } finally {
            System.out.println(a + " / " + b + " = " + qismet);
        }
    }
}
