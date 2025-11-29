public class Program2 {
    public static void main(String[] args) {

        boolean characterInUppercase1 = Character111.IsUpper('a');
        boolean characterInUppercase2 = Character111.IsUpper('B');
        boolean characterInUppercase3 = Character111.IsUpper('d');
        boolean characterInUppercase4 = Character111.IsUpper('f');
        boolean characterInUppercase5 = Character111.IsUpper('G');

        System.out.printf("%b\n", characterInUppercase1);
        System.out.printf("%b\n", characterInUppercase2);
        System.out.printf("%b\n", characterInUppercase3);
        System.out.printf("%b\n", characterInUppercase4);
        System.out.printf("%b\n", characterInUppercase5);
    }
}