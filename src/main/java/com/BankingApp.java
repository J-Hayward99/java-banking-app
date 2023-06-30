package main.java.com;
// IMPORTS
import java.util.Scanner;                                                               // Used to read input text


/*
NOTES:
- na

SPEC:
- Login
- - Database
- - Password
- - - Encryption
- - - - Salting and peppering
- - - - SHA?
- - - - Maybe standard methods?

- Balance
- - Income
- - - Annual taxes
- - Outcomes
- - - Deductables

- Investment account
- - Stock growth
- - Dividend growth
- - - Yield
- - - Payout period
- - - Annual yield
- - - Result income
- - - - 1, 2, 5, 10, 20, 40 years
 */



public class BankingApp {
    // CONSTANTS & ENUMs


    // Functions


    // Main
    public static void main(String[] args)
    {
        // INITIATE
        Scanner textInput = new Scanner(System.in);                                 //  // This is used for the scanner of the input

        // GREETING
        System.out.println("Welcome to my test banking app.");
        System.out.println("--Made by J-Hayward99!");

        // LOGIN
        System.out.println("Please login to your account.");
        System.out.print("Login: ");
        String accountName      = getCleanText(textInput);                          //  // Check docs to ensure no bad cases
        System.out.print("Password: ");
        String accountPassword  = getCleanText(textInput);                          //  // Check docs to ensure no bad cases

        // DEBUG
        System.out.println("\nYour login is:\t\t" + accountName
            + "\nYour password is:\t" + accountPassword);

        // SHUTTING DOWN
        textInput.close();
    }

    private static String getCleanText(Scanner textInput){                          // This is used to get the text then clean it before saving
    
        // GET LINE
        String text = textInput.nextLine();                                         //  // Get the line
        
        // FILTER
        return text.replaceAll("[^a-zA-Z0-9]","");                                  //  // Regex the line only to letters and numbers
    }
}
