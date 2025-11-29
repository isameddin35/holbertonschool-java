import food.*;

public class Program66 {
    public static void main(String[] args) {
        Character gandalf = new Character();
        Character bilbo = new Character();
        Character legolas = new Character();
        Character tauriel = new Character();

        gandalf.eat(new Food[] {
                new Apple(),
                new Apple(),
                new Mushroom(),
                new OtherFood()
        });

//        System.out.println(gandalf.toIString());

        bilbo.eat(new Food[] {
                new HoneyCake(),
                new Apple(),
                new Melon(),
                new Mushroom()
        });

//        System.out.println(bilbo.toIString());

        legolas.eat(new Food[] {
                new HoneyCake(),
                new Apple(),
                new Melon(),
                new Mushroom(),
                new HoneyCake(),
                new Cram(),
                new Cram()
        });

//        System.out.println(legolas.toIString());

        legolas.eat(new Food[] {
                new HoneyCake(),
                new Apple(),
                new Melon(),
                new Mushroom(),
                new HoneyCake(),
                new Lembas(),
                new Lembas(),
                new Cram()
        });

//        System.out.println(legolas.toIString());
        System.out.print("-9 - Angry\n" +
                "-3 - Sad\n" +
                "6 - Happy\n" +
                "16 - Very Happy\n");
    }
}
