
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user for name
        System.out.println("Please enter your name:");

        // Get name
        String name = input.nextLine();

        // Greet user
        System.out.println("Hello " + name + ". " + "How are you today?");
    }
}
