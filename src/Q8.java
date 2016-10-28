
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
        int currentSquare = 1;

        // Continue playing while Player is not on the final square
        while (currentSquare < 100) {
            // Ask Player for the sum of the dice
            System.out.println("Enter sum of dice:");
            // Variable to store Player's sum of the dice
            int sumDice = input.nextInt();

            // If the dice are not rolled (0)
            if (sumDice == 0) {
                // Output that Player has quit
                System.out.println("You Quit!");
                // End loop
                break;

                // Else if the sum is between 2 and 12
            } else if (sumDice >= 2 && sumDice <= 12) {
                    // Add the sum of the dice to the total squares moved to get Player's current square
                    currentSquare = sumDice + currentSquare;

                    // If Player lands on the first ladder (square 9)
                    if (currentSquare == 9) {
                        // Player climbs up to square 34
                        currentSquare = 34;
                    }
                    // If Player lands on the second ladder (square 40)
                    if (currentSquare == 40) {
                        // Player climbs up to square 65
                        currentSquare = 65;
                    }
                    // If Player lands on the third ladder (square 67)
                    if (currentSquare == 67) {
                        // Player climbs up to square 86
                        currentSquare = 86;
                    }
                    // If Player lands on the first snake (square 54)
                    if (currentSquare == 54) {
                        // Player slides down to square 19
                        currentSquare = 19;
                    }
                    // If Player lands on the second snake (square 90)
                    if (currentSquare == 90) {
                        // Player slides down to square 64
                        currentSquare = 64;
                    }
                    // If Player lands on the third snake (square 99)
                    if (currentSquare == 99) {
                        // Player slides down to square 77
                        currentSquare = 77;
                    }
                    // If Player is on or beyond square 100
                    if (currentSquare >= 100) {
                        // Output that Player wins
                        System.out.println("You Win!");
                    }

                    // Output Player's current square
                    System.out.println("You are on square " + currentSquare + ".");

                }
            }
        }
    }

