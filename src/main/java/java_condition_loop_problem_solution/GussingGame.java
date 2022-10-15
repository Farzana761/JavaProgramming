package java_condition_loop_problem_solution;

import java.util.Random;
import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        int ans, guess, guessNum = 0;
        final int maxGuesses = 5;
        String str, playAgain = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        ans = generator.nextInt(101) + 1;

        while (playAgain.equals("y") || playAgain.equals("Y")) {
            System.out.println("Hey Welcome to the game \nGuess a number between 1 and 100");
            System.out.println("Guess a number:");

            guess = scan.nextInt();
            guessNum = 0;
            while (guess != 0)
            {
                guessNum++;
                if (guess == ans) {
                    System.out.println("Great! You have guessed the correct number.");
                    break;
                } else if (guess < ans)
                    System.out.println("Your input is lower than the generated number.");
                else if (guess > ans)
                    System.out.println("Your input is higher than the generated number.");
                if (guessNum == maxGuesses) {
                    System.out.println("The number was " + ans +"\nBetter luck next time");
                    break;
                }
                System.out.println("Enter your guess (0 to quit):");
                guess = scan.nextInt();
            }
            System.out.println("Want to Play again?(y/n)");
            playAgain = scan.next();
        }
        System.out.println("Thanks for playing!");
    }
}


