package Task2;
import java.util.*;
public class NumberGame {

    public static void guessNumber(int randomNumber) {
        Scanner sc = new Scanner(System.in);
        int noOfAttempts = 5;
        for (int count = 1; count <= noOfAttempts; count++) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + count + " attempts.");
                return;
            }
            if (Math.abs(userGuess - randomNumber) == 1) {
                System.out.println("You are very close! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else {
                System.out.println("Your guess is too high! Try again.");
            }
        }
        System.out.println("Game Over!");
        System.out.println("The correct number was: " + randomNumber);
    }
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 101);

        System.out.println("Guess the number between 0 and 100");

        guessNumber(randomNumber);
    }
}