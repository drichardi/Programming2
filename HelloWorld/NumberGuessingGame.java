import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner input = new Scanner(System.in);
    
    public static void Play() {
        final int NUMBER_TO_GUESS = (int)(Math.random()*50 + 1);
                
        Guess(NUMBER_TO_GUESS);
        System.out.println("You won! Thank you for playing");
    }
    
    public static void Guess(final int NUMBER_TO_GUESS) {
        System.out.print("Enter your guess between 1 and 50: ");
        int guess = input.nextInt();
        if( guess == NUMBER_TO_GUESS ) {
            System.out.println("Correct!");
        } 
        else if( guess > NUMBER_TO_GUESS ) {
            System.out.println("Try Again, you guessed too high.");
            Guess(NUMBER_TO_GUESS);
        } else {
            System.out.println("Try Again, you guessed too low.");
            Guess(NUMBER_TO_GUESS);
        }
    }
    
    public static void main(String[] args) {
        Play();
    }
}