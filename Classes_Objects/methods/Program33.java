public class Program33 {
    public static void main(String[] args) {
        CharacterGame33 character1 = new CharacterGame33();

        character1.setName("Sonic");
        character1.setCurrentHealth(10);

        System.out.printf("%d\n", character1.getCurrentHealth());

        character1.receiveHealing(91);

        System.out.printf("%d\n", character1.getCurrentHealth());

        character1.takeDamage(25);

        System.out.printf("%d\n", character1.getCurrentHealth());

        character1.takeDamage(80);

        System.out.printf("%d\n", character1.getCurrentHealth());
    }
}
