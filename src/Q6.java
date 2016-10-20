
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // GATHER USAGE PATTERN
        // Ask user for number of daytime minutes
        System.out.println("Number of daytime minutes:");
        // Variable to store daytime minutes
        double dayMin = input.nextDouble();

        // Ask user for number of evening minutes
        System.out.println("Number of evening minutes:");
        // Variable to store evening minutes
        double evenMin = input.nextDouble();

        // Ask user for number of weekend minutes
        System.out.println("Number of weekend minutes:");
        // Variable to store weekend minutes
        double endMin = input.nextDouble();

        // CALCULATE PLAN COSTS FOR USAGE PATTERN
        // Calculate dayMin for Plan A (100 free then 0.25 per minute)
        double dayMinA = dayMin - 100;
        // If it is a negative integer, then set it to 0
        if (dayMinA < 0) {
            dayMinA = 0;
        }

        // Variable to store cost of Plan A
        double costA = (dayMinA * 0.25) + (evenMin * 0.15) + (endMin * 0.20);
        // Output cost of Plan A
        System.out.println("Plan A costs " + costA);

        // Calculate dayMin for Plan B (250 free then 0.45 per minute)
        double dayMinB = dayMin - 250;
        // If it is a negative integer, then set it to 0
        if (dayMinB < 0) {
            dayMinB = 0;
        }

        // Variable to store cost of Plan B
        double costB = (dayMinB * 0.45) + (evenMin * 0.35) + (endMin * 0.25);
        // Output cost of Plan B
        System.out.println("Plan B costs " + costB);

        // CHOOSE CHEAPEST PLAN
        // If Plan A is cheaper
        if (costA < costB) {
            // Output to user
            System.out.println("Plan A is cheapest.");
        }

        // If Plan B is cheaper
        if (costA > costB) {
            // Output to user
            System.out.println("Plan B is cheapest.");
        }

        // If both plans are the same cost
        if (costA == costB) {
            // Output to user
            System.out.println("Plan A and Plan B are the same price.");
        }
    }
}
