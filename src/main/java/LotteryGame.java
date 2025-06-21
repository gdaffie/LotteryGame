/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unico
 */
import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        // Generate three random numbers between 0 and 9
        
        Random random = new Random();
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);
        int randomNumber3 = random.nextInt(10);

        // Prompt the user to enter their three numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Lottery Game!");
        System.out.println("Please enter three different numbers between 0 and 9.");
        System.out.print("Please enter your first guess: ");
        int userNumber1 = scanner.nextInt();
        System.out.print("Please enter your second guess: ");
        int userNumber2 = scanner.nextInt();
        System.out.print("Please enter your third guess: ");
        int userNumber3 = scanner.nextInt();

        // Compare the user's numbers with the random numbers and determine the winnings
        int correctGuesses = 0;
        if (userNumber1 == randomNumber1 || userNumber1 == randomNumber2 || userNumber1 == randomNumber3) {
            correctGuesses++;
        }
        if (userNumber2 == randomNumber1 || userNumber2 == randomNumber2 || userNumber2 == randomNumber3) {
            correctGuesses++;
        }
        if (userNumber3 == randomNumber1 || userNumber3 == randomNumber2 || userNumber3 == randomNumber3) {
            correctGuesses++;
        }

        // Display the results
        System.out.println("Lottery numbers: " + randomNumber1 + " " + randomNumber2 + " " + randomNumber3);
        System.out.println("Your numbers: " + userNumber1 + " " + userNumber2 + " " + userNumber3);
        
        if (correctGuesses == 3) {
            System.out.println("You have won: $1000!!");
        } else if (correctGuesses == 2) {
            System.out.println("You have won: $100");
        } else if (correctGuesses == 1) {
            System.out.println("You have won: $10");    
        } else {
            System.out.println("You have won: $0");
        }
    }
}

