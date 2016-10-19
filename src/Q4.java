
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // GATHER EXPENSES
        // Cost of food
        System.out.println("Enter the cost of the food:");
        // Variable to store cost of food
        double food = input.nextDouble();

        // Cost of DJ
        System.out.println("Enter the cost of the DJ:");
        // Variable to store cost of DJ
        double dj = input.nextDouble();

        // Cost to rent hall
        System.out.println("Enter the cost to rent the hall:");
        // Variable to store cost of hall
        double hall = input.nextDouble();

        // Cost of decorations
        System.out.println("Enter the cost of the decorations:");
        // Variable to store cost of decorations
        double decor = input.nextDouble();

        // Cost for staff
        System.out.println("Enter the cost for the staff:");
        // Variable to store cost of the staff
        double staff = input.nextDouble();

        // For miscellaneous costs
        System.out.println("Enter the miscellaneous costs:");
        // Variable to store misc costs
        double misc = input.nextDouble();

        // Create variable to store the total cost
        double total = food + dj + hall + decor + staff + misc;

        // Create variable to store the # of tickets needed to cover the total cost
        double tickets = Math.ceil(total / 35);

        // Tell user the total cost & the number of tickets
        System.out.println("The total cost is $" + total + ". " + "You will need to sell " + tickets + " tickets to break even.");
    }
}
