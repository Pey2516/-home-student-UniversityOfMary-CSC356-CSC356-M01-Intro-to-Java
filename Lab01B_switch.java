
import java.util.Scanner;

public class Lab01B_switch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int month;

        System.out.print("What month is it? ");
        month = input.nextInt();

        switch( month )
        {
        case 1:
        System.out.println( "January" );//Prints the month of January.
        break;

        case 2:
        System.out.println( "February" );//Prints the month of February.
        break;

        case 3:
        System.out.println( "March" );//Prints the month of March.
        break;

        case 4:
        System.out.println( "April" );//Prints the month of April.
        break;

        case 5:
        System.out.println( "May" );//Prints the month of May.
        break;

        case 6:
        System.out.println( "June" );//Prints the month of June.
        break;

        case 7:
        System.out.println( "July" );//Prints the month of July.
        break;

        case 8:
        System.out.println( "August" );//Prints the month of August.
        break;

        case 9:
        System.out.println( "September" );//Prints the month of September.
        break;

        case 10:
        System.out.println( "October" );//Prints the month of October.
        break;

        case 11:
        System.out.println( "November" );//Prints the month of November.
        break;

        case 12:
        System.out.println( "December" );//Prints the month of December.
        break;

        default:
        System.out.println( "Invalid Month" );
        break;
        } 
    input.close();
    }
}
