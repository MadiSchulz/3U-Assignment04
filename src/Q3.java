
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Instruct user to enter 4 numbers
        System.out.println("Enter four numbers on seperate lines below:");

        // GATHER USER INPUT:
        // Get first number
        double first = input.nextDouble();
        // Get second number
        double second = input.nextDouble();
        // Get third number
        double third = input.nextDouble();
        // Get fourth number
        double fourth = input.nextDouble();

        // Tell user their numbers
        System.out.println("Your numbers were " + first + ", " + second + ", " + third + ", and " + fourth + ".");

    }
}
