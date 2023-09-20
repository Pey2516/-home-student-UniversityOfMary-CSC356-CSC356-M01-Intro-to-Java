
import java.util.Scanner;

public class Lab01B_String
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.print("Your word is: " + word + "\n");//Tells you your word.
        System.out.print("The length of your word is: " + word.length() + "\n");//Tells the length of your word.
        System.out.print("Your word in upper case is: " + word.toUpperCase() + "\n");//Makes the word upper case.
        System.out.print("Your word in lower case is: " + word.toLowerCase() + "\n");//Makes the word lower case.
        System.out.print("The first character of your word is: " + word.charAt(0) + "\n");//Tells you the first integer.
        input.close();
    }
}
