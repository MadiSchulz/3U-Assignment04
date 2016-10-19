
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
        int firstTotal = input.nextInt();
        // Ask for user's mark on first test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on first test
        int firstMark = input.nextInt();
        
        // Variable to store first percentage
        int perFirst = firstMark / firstTotal;
        
        
        // Ask for total marks on second test
        System.out.println("What was the second test out of?:");
        // Variable to store total marks on second test
        int secondTotal = input.nextInt();
        // Ask for user's mark on second test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on second test
        int secondMark = input.nextInt();
        
        // Variable to store second percentage
        int perSecond = secondMark / secondTotal;
        
        // Ask for total marks on third test
        System.out.println("What was the third test out of?:");
        // Variable to store total marks on third test
        int thirdTotal = input.nextInt();
        // Ask for user's mark on third test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on third test
        int thirdMark = input.nextInt();
        
        // Variable to store third percentage
        int perThird = thirdMark / thirdTotal;
        
        // Ask for total marks on fourth test
        System.out.println("What was the fourth test out of?:");
        // Variable to store total marks on fourth test
        int fourthTotal = input.nextInt();
        // Ask for user's mark on fourth test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on fourth test
        int fourthMark = input.nextInt();
        
        // Variable to store fourth percentage
        int perFourth = fourthMark / fourthTotal;
        
        // Ask for total marks on fifth test
        System.out.println("What was the fifth test out of?:");
        // Variable to store total marks on fifth test
        int fifthTotal = input.nextInt();
        // Ask for user's mark on fifth test
        System.out.println("What mark did you get?:");
        // Variable to store user's mark on fifth test
        int fifthMark = input.nextInt();
        
        // Variable to store first percentage
        int perFifth = fifthMark / fifthTotal;
        
        // OUTPUT TEST SCORES
        System.out.println("Test scores for " + name + ":");
        System.out.println("Test 1:" + perFirst + "%");
        System.out.println("Test 2:" + perSecond + "%");
        System.out.println("Test 3:" + perThird + "%");
        System.out.println("Test 4:" + perFourth + "%");
        System.out.println("Test 5:" + perFifth + "%");
        
        // Create variable for average test percentage
        int average = (firstMark + secondMark + thirdMark + fourthMark + fifthMark)/(firstTotal + secondTotal + thirdTotal + fourthTotal + fifthTotal);
        // Output average test score
        System.out.println("Average:" + average + "%");
        
    }
}
