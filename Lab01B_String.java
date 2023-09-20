
import java.util.Scanner;

public class Lab01B_String
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.print("Your word is: " + word + "\n");
        System.out.print("The length of your word is: " + word.length() + "\n");
        System.out.print("Your word in upper case is: " + word.toUpperCase() + "\n");
        System.out.print("Your word in lower case is: " + word.toLowerCase() + "\n");
        System.out.print("The first character of your word is: " + word.charAt(0) + "\n");
        input.close();
    }
}
