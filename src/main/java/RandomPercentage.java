import java.util.Random;
import java.text.DecimalFormat;

public class RandomPercentage {
    public static void main(String[] args) {
        Random rand = new Random();
        Random randseeded = new Random(3);
        DecimalFormat df = new DecimalFormat("##.00%");

        double percent1 = rand.nextDouble();
        double percent2 = randseeded.nextDouble();

        System.out.println("Unseeded Random: " + df.format(percent1));
        System.out.print("Seeded Random: " + df.format(percent2));

        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}