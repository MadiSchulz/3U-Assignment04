
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // GET DRIVER'S INPUT

        // Get speed limit
        System.out.println("Enter the speed limit:");
        // Variable to store speed limit
        int vLimit = input.nextInt();

        // Get recorded speed of car
        System.out.println("Enter the recorded speed of the car:");
        // Variable to store speed of car
        int vCar = input.nextInt();

        // STORE RADAR VARIABLES (FINES)

        // Variable to store fine of 1-20 over speed limit
        int vFineLow = 100;
        // Varaible to store fine of 21-30 over speed limit
        int vFineMid = 270;
        // Variable to store fine of 31 or above speed limit
        int vFineHigh = 500;

        // GIVE DRIVER THE RADAR OUTPUT

        // If driver is speeding
        if (vCar > vLimit) {
            // Initial output for all instances
            System.out.print("You are speeding and your fine is $");
            // Add fine for 1-20 over speed limit
            if (vCar < vLimit + 20) {
                System.out.print(vFineLow + ".");
            }
            // Add fine for 21-30 over speed limit
            if (vCar > vLimit + 20 && vCar < vLimit + 31) {
                System.out.print(vFineMid + ".");
            }
            // Add fine for 31 or above speed limit
            if (vCar > vLimit + 30) {
                System.out.print(vFineHigh + ".");
            }
        } else {
            // Else if all of the above is false, the driver is not speeding
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
