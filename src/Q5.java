
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Ask user for name
        System.out.println("Please enter your name:");
        // Variable to store user's name
        String name = input.next();
        
        // GATHERING TEST SCORE DATA
        
        // Ask for total marks on first test
        System.out.println("What was the first test out of?:");
        // Variable to store total marks on first test
        double firstTotal = input.nextDouble();
        // Ask for user's mark on first test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on first test
        double firstMark = input.nextDouble();
        
        // Variable to store first percentage
        double perFirst = (firstMark / firstTotal) * 100;
        
        
        // Ask for total marks on second test
        System.out.println("What was the second test out of?:");
        // Variable to store total marks on second test
        double secondTotal = input.nextDouble();
        // Ask for user's mark on second test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on second test
        double secondMark = input.nextDouble();
        
        // Variable to store second percentage
        double perSecond = (secondMark / secondTotal) * 100;
        
        // Ask for total marks on third test
        System.out.println("What was the third test out of?:");
        // Variable to store total marks on third test
        double thirdTotal = input.nextDouble();
        // Ask for user's mark on third test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on third test
        double thirdMark = input.nextDouble();
        
        // Variable to store third percentage
        double perThird = (thirdMark / thirdTotal) * 100;
        
        // Ask for total marks on fourth test
        System.out.println("What was the fourth test out of?:");
        // Variable to store total marks on fourth test
        double fourthTotal = input.nextDouble();
        // Ask for user's mark on fourth test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on fourth test
        double fourthMark = input.nextDouble();
        
        // Variable to store fourth percentage
        double perFourth = (fourthMark / fourthTotal) * 100;
        
        // Ask for total marks on fifth test
        System.out.println("What was the fifth test out of?:");
        // Variable to store total marks on fifth test
        double fifthTotal = input.nextDouble();
        // Ask for user's mark on fifth test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on fifth test
        double fifthMark = input.nextDouble();
        
        // Variable to store first percentage
        double perFifth = (fifthMark / fifthTotal) * 100;
        
        // OUTPUT TEST SCORES
        System.out.println("Test scores for " + name + ":");
        // First test
        System.out.println("Test 1: " + perFirst + "%");
        // Second test
        System.out.println("Test 2: " + perSecond + "%");
        // Third test
        System.out.println("Test 3: " + perThird + "%");
        // Fourth test
        System.out.println("Test 4: " + perFourth + "%");
        // Fifth test
        System.out.println("Test 5: " + perFifth + "%");
        
        // Create variable for average test percentage
        double average = ((firstMark + secondMark + thirdMark + fourthMark + fifthMark)/(firstTotal + secondTotal + thirdTotal + fourthTotal + fifthTotal)) * 100;
        // Output average test score
        System.out.println(name + "'s " + "average: " + average + "%");
        
    }
}
