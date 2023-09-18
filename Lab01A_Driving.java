import java.util.Scanner;

public class Lab01A_Driving 
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner ( System.in ); //Declare and Initialize keyboard input.
        double distance;
        double mpg; //This is the variable for miles per gallon.
        double ppg; //This is the variable for price per gallon.
        double cost; // This is the cost of the trip.

        // Asks the user to input driving distance, miles per gallon, and price per gallon.
        System.out.println ("Enter the driving distance: " );
        System.out.println ("Enter the miles per gallon: " );
        System.out.println ("Enter price per gallon: ");

        // Read Integer value from the keyboard and store the numbers entered.
        distance = keyboard.nextDouble();
        mpg = keyboard.nextDouble();
        ppg = keyboard.nextDouble();
        cost = (distance/mpg) * ppg;

        //This section of code prints off the distance traveled, mpg,ppg, and the cost of the trips.
        System.out.println ("Enter the driving distance: " + distance);
        System.out.println ("Enter miles per gallon: " + mpg);
        System.out.println ("Enter price per gallon: " + ppg);
        System.out.printf ("The cost of driving is $ %.2f",  cost);
    }
}