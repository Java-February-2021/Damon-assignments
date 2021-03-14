import java.util.zip.GZIPInputStream;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        System.out.println("The gorrillas energy is now " + gorilla.energyLevel);

        gorilla.eatBanana();
        gorilla.eatBanana();
        gorilla.eatBanana();
        System.out.println("The gorrillas energy is now " + gorilla.energyLevel);

        gorilla.climb();
        System.out.println("The gorrillas energy is now " + gorilla.energyLevel);

    }
    
}
