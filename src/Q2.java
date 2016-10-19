
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user for inches value
        System.out.println("Enter the measurement in inches:");

        // Get inches value from user
        double inch = input.nextDouble();

        // Create variable to store answer in cm
        double centi = inch * 2.54;

        // Print answer for user
        System.out.println(inch + " inches is the same as " + centi + " centimetres.");
    }
}
