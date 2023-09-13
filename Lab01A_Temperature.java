import java.util.Scanner;

public class Lab01A_Temperature 
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner ( System.in ); //Declare and Initialize keyboard input
        double C;
        double F;

        // Output String, leave cursor at the end of the line
        System.out.println( "Enter Desired Number In Celsius: " );

        // Read Integer value from the keyboard and store the number entered to ‘input’
        C = keyboard.nextDouble();

        F = (9.0/5.0) * C +32;

        System.out.println ("Your Celsius Degree in Fahrenheit : " + F);
    }
}
