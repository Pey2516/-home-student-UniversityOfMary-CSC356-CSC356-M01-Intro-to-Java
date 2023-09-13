import java.util.Scanner;

public class Lab01A_Temperature 
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner ( System.in );
        double C;
        double F;

        System.out.println( "Enter Desired Number In Celsius: " );

        // Read Integer value from the keyboard and store the number entered
        C = keyboard.nextDouble();

        //Equation for convertion of Celsius to Fahrenheit
        F = (9.0/5.0) * C +32;

        //Tells you the integer you inputed into Fahrenheit
        System.out.println ("Your Celsius Degree in Fahrenheit : " + F);
    }
}
