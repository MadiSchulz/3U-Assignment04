
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for Player's input
        Scanner input = new Scanner(System.in);

        // Variable to store the Player's current square, starting at square 1
        int squaresMoved = 1;
        
        
        // WHILE LOOP FOR A SINGLE TURN
        
        // Continue playing while the Player is not on the final square
        while (squaresMoved > 100) {
            
            // Ask Player for the sum of the dice
            System.out.println("Enter sum of dice:");
            
            // Variable to store Player's sum of the dice
            int sumDice = input.nextInt();
            
            // Move Player the number of squares rolled by the dice
            squaresMoved + sumDice();
            
            
        }
        
        
        // Sum of dice is a value between 2 and 12
        // if 0
        if (sumDice >= 2 && sumDice <= 12) {
            // Add the sum of the dice to the number of squares moved
            // CHECK IF ON ANY SPECIAL SQUARES (SNAKES OR LADDERS)
            // Square 9 (first ladder)
        }
    }
}
