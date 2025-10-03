import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random(5);

        System.out.println("Unseeded: " + rand1.nextInt(5));
        System.out.println("Unseeded: " + rand2.nextInt(5));
        System.out.println("Unseeded: " + rand3.nextInt(5));
        System.out.println("Seeded: " + rand4.nextInt(5));
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        
        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
