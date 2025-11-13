public class PrintFormattingNumbers {
    public static void main(String[] args) {
        float tax = 0.2456f;
        float value = 7654.321f;

        // Format value with commas and 2 decimals
        System.out.printf("Value: $%,.2f%n", value);

        // Format tax as percentage (rounded)
        System.out.printf("Tax: %.2f%%%n", tax * 100);
    }
}
