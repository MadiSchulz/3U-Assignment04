
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

        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // Variable to store number of squares moved, starting at square 1
        int squaresMoved = 1;

        // Roll the dice until total number of squares moved is equal to or exceeds 100
        while (squaresMoved <= 100) {
            // Ask user for the sum of the dice
            System.out.println("Enter sum of dice:");
            // Variable to store sum of pair of dice
            int sumDice = input.nextInt();
            // If sum of dice is not between 2 and 12
            if (sumDice <= 1 && sumDice >= 13) {
                // If sum of dice is 0
                if (sumDice == 0) {
                    // User quits
                    System.out.println("You Quit!");
                    break;
                } else {
                    // Else random number
                    // Nothing happens; re-enter sum of dice  
                    break;
                }

            } else {
                // If sum of dice is between 2 and 12
                if (sumDice >= 2 && sumDice <= 12) {
                    // Add sum of the dice to the number of squares moved (variable to store answer)
                    int currentSquare = squaresMoved + sumDice;
                    // If land on any special square...
                    // If land on first ladder (square 9)
                    if (currentSquare == 9){
                    // Variable to store ladder 1
                    int ladderOne = squaresMoved + 25;
                    // Output current square
                    }
                    
                    // ladderTwo
                    // ladderThree
                    // snakeOne
                    // snakeTwo
                    // snakeThree
                    // Finish
                    // Else move
                }
            }


            
            // Variable to store ladder 2
            int ladderTwo;
            // Variable to store ladder 3
            int ladderThree;
            // Variable to store snake 1
            int snakeOne;
            // Variable to store snake 2
            int snakeTwo;
            // Variable to store snake 3
            int snakeThree;

        }
    }
}
