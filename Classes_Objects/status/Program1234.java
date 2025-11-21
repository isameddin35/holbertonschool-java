public class Program1234 {
    public static void main(String[] args) {
        CharacterGame44 character1 = new CharacterGame44();

        character1.setName("Sonic");
        character1.setCurrentHealth(0);

        System.out.printf("%d - %s\n", character1.getCurrentHealth(), character1.getStatus());

        character1.receiveHealing(90);

        System.out.printf("%d - %s\n", character1.getCurrentHealth(), character1.getStatus());

        character1.takeDamage(25);

        System.out.printf("%d - %s\n", character1.getCurrentHealth(), character1.getStatus());

        character1.takeDamage(80);

        System.out.printf("%d - %s\n", character1.getCurrentHealth(), character1.getStatus());

        character1.receiveHealing(10);

        System.out.printf("%d - %s\n", character1.getCurrentHealth(), character1.getStatus());
    }
}
