
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        
        // GATHER USAGE PATTERN
        
        // Ask user for number of daytime minutes
        System.out.println("Number of daytime minutes:");
        // Variable to store daytime minutes
        double dayMin = input.nextDouble();
        
        // Ask user for number of evening minutes
        System.out.println("Number of evening minutes:");
        // Variable to store evening minutes
        double evenMin = input.nextDouble();
        
        // Ask user for number of weekend minutes
        System.out.println("Number of weekend minutes:");
        // Variable to store weekend minutes
        double endMin = input.nextDouble();
        
        // CALCULATE PLAN COSTS FOR USAGE PATTERN
        
        // Calculate dayMin for Plan A
        double dayMinAcalc = (dayMin - 100);
        if(dayMinAcalc > 0) {
            double dayMinA = dayMinAcalc * 0.45;
        }else{
            double dayMinA = 0;
        }
        
        double dayMinA;
        
        // Calculate dayMin for Plan B
        
        // Variable to store cost of Plan A
        double costA = dayMinA + (evenMin * 0.15) + (endMin * 0.20);
        
        //** 
        System.out.println("Cost A: " + costA);
        
        
        // Variable to store day minutes for Plan B
        double dayMinB = (dayMin - 200) * 0.45;

        // Variable to store cost of Plan B
        double costB = dayMinB + (evenMin * 0.35) + (endMin * 0.25);
        
        //**
        System.out.println("Cost B: " + costB);
        
        
        
        // CHOOSE CHEAPEST PLAN
        
        // If Plan A is cheaper
        // Output to user
        
        // If Plan B is cheaper
        // Output to user
        
        // If both plans are the same cost
        // Output to user
    }
}
