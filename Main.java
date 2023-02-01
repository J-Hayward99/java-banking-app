// IMPORTS
import java.util.Scanner;

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
- - - Resultive income
- - - - 1, 2, 5, 10, 20, 40 years
 */



public class Main {
    // Variables
    String accountName;                                                                 // Account name for login, raw input

    // CONSTANTS & ENUMs


    // Functions


    // Main
    public static void main(String[] args){
        System.out.println("Hello World!");                                             // Sanity check to see if the program works.

        // Init
        Scanner textInput = new Scanner(System.in);                                     // This is used for the scanner of the input


        // Greeting
        System.out.println("Welcome to my test banking app.");
        System.out.println("--Made by J-Hayward99!");

        // Login
        System.out.println("Please login to your account.");

        System.out.print("Login: ");
        accountName = textInput.nextLine();                                             // Check docs to ensure no bad cases

        // # # INCLUDE REGEX

    }
}
