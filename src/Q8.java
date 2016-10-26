
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
        
        // Greet Player for new game
        System.out.println("Welcome, Player!");
        
        // Variable to store number of squares moved, starting at square 1
        int squaresMoved = 1;
        
        
        // WHILE LOOP FOR A SINGLE TURN
        // Keep playing while the total number of squares moved is less than 100
        while(squaresMoved <=99){
        // Ask Player for the sum of the dice
        System.out.println("Enter sum of dice:");
        // Variable to store sum of pair of dice
        int sumDice = input.nextInt();
            // Sum of dice is a value between 2 and 12
            if(sumDice >=2 && sumDice <=12){
                
                // Add the sum of the dice to the number of squares moved
                // CHECK IF ON ANY SPECIAL SQUARES (SNAKES OR LADDERS)
                // Square 9 (first ladder)

            }
                
                    // If ladder or snake
                        // Move extra, break loop
                    // If finish
                        // Player wins
                    // break turn
                // 
            // No value (0)
                // Player quits
        
        }   
    }
}
