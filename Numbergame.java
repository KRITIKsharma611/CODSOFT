import java.util.Random;
import java.util.Scanner;

public class soft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.println("Your current score: " + score);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}
