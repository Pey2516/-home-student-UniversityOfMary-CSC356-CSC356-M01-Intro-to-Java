
public class Lab01B_do_while_loop 
{
    public static void main( String[] args )
    { 
        int lp = 20; // Initialize lp to 1       
        do
        {
            lp -= 1;
            System.out.print( lp + " " );
            lp--; 
        }
        while ( lp > 1 ); // Execute loop while lp less than or equal to 10
        
        System.out.print( "\n" );
    }
}
