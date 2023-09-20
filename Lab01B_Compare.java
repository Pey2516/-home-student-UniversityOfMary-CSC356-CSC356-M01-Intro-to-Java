
import java.util.Scanner;

public class Lab01B_Compare
{
    public static void main(String [] args ) 
    {
        Scanner input = new Scanner( System.in );
        String city1, city2, city3, temp;

        System.out.print( "Enter the first city : " );
        city1 = input.nextLine();
      
        System.out.print( "Enter the second city: " );
        city2 = input.nextLine();

        System.out.print( "Enter the third city: " );
        city3 = input.nextLine();
		
        if ( city1.compareTo( city2 ) > 0)//Compares city1 and city2 to put them in alpabetical
        {
            temp = city1;
            city1 = city2;
            city2 = temp; 

            if ( city1.compareTo( city3 ) > 0)//Once city1 and city2 are checked it checks to make sure city1 and city3 are in alphabetical order
            {
                temp = city1;
                city1 = city3;
                city3 = temp; 
            }
            if ( city2.compareTo( city3 ) > 0)//After city1 and city3 are in order, it then checks to make sure city2 and city3 are in alphabetical order
            {
                temp = city2;
                city2 = city3;
                city3 = temp; 
            }
        }
        System.out.printf("The three cities in alphabetical order are:\n%s\n%s\n%s\n", city1, city2, city3);
        input.close();
    }
}