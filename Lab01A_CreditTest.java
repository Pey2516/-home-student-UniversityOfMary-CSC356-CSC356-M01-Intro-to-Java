import java.util.Scanner;

public class Lab01A_CreditTest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner( System.in );
        int     account;       // account number
        int     month;         // month
        double  oldBalance;    // starting balance
        double  charges;       // total charges
        double  credits;       // total credits
        double  creditLimit;   // allowed credit limit
        double  newBalance;    // new balance

        creditLimit = 1000.00;

        System.out.print( "Enter Account Number (or -1 to quit): " );

        // Task 1: Write code to input an integer and store it in
        account = input.nextInt();
        
        /* Task 2: Write code to input an integer for the month and */
        /*         store it in the instance variable 'month' */
        if( account == -1)
        {
            System.out.print("Goodbye!");
        }

        else
        {
            System.out.print("What month is it? ");

            month = input.nextInt();

            /* Task 3: Implement a switch statement that uses the instance */
            /*         variable 'month' for the 'switch-expression' */
            switch (month)
            {
                /* Task 4: Write code that creates a 'case' statement for each */
                /*         month of the year.  */
                case 1: System.out.print("The month is January.\n");
                    break;
                case 2: System.out.print("The month is February.\n");
                    break;
                case 3: System.out.print("The month is March.\n");
                    break;
                case 4: System.out.print("The month is April.\n");
                    break;
                case 5: System.out.print("The month is May.\n");
                    break;
                case 6: System.out.print("The month is June.\n");
                    break;
                case 7: System.out.print("The month is July.\n");
                    break;
                case 8: System.out.print("The month is August.\n");
                    break;
                case 9: System.out.print("The month is September.\n");
                    break;
                case 10: System.out.print("The month is October.\n");
                    break;
                case 11: System.out.print("The month is November.\n");
                    break;
                case 12: System.out.print("The month is December.\n");
                    break;
                default: System.out.print("That is not a month\n.");
                    break;
            }
            
          /* Task 5: write code to input the rest of the customer information. */
        /*         Prompt for Balance */
        /*         Read old balance, store it in instance variable 'oldBalance' */
        /*         Prompt for New Charges */
        /*         Read new Charges, store it in instance variable 'charges' */
        /*         Prompt for Payments to the Account */
        /*         Read for Payments, store it in instance variable 'credits' */
        /*         Prompt for Credit Limit */
        /*         Read in Credit Limit, store it in instance variable 'creditLimit' */
        /*         Use input.nextDouble() to read a Double value from the keyboard */  

        //This section asks for your old balance, amount of charges used, and how many credits were used.
        System.out.print("What is your old balance?\n");
        oldBalance = input.nextDouble();

        System.out.print("What was the amount of charges?\n");
        charges = input.nextDouble();

        System.out.print("What amount of credits was used?\n");
        credits = input.nextDouble();


        System.out.printf("Your old balance was $%.2f \n", oldBalance);
        System.out.printf("What was the amount of charges used? $%.2f \n", charges);
        System.out.printf("What was the amount of credits used? $%.2f \n", credits);


        /* Task 6: write code to compute the new balance */
        /*         New Balance is the Old Balance minus any payments plus any new charges */
        /*         Store this value in 'newBalance'  */
        newBalance = oldBalance + charges - credits;

        System.out.printf("Your new balance is $%.2f \n", newBalance);

        /* Task 7: write code that will check if the new balance is greater than */
        /*         the credit limit and output the proper information */

        if( newBalance > creditLimit)
        {
            System.out.print("You have exceeded your credit limit.");
        }
        else
        {
            /* Task 8: write code to check if the balance has increased or decreased */
            /*         between original balance and the new balance, use 'if' statement */

            if (newBalance > oldBalance)
            {
                System.out.print("Balance Increasing");
            }
            else
            {
                System.out.print("Good Job");
            }

        }
        } 
        input.close();
    }
}
