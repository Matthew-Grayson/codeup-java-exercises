import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        double randomNum = Math.floor(Math.random() * 100) + 1;
        Scanner guessScan = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100. Guess what number it is: ");
        processGuess(guessScan.nextInt(), randomNum);
    }
    public static void processGuess(double guess, double rand) {
        if(guess < rand) {
            Scanner guessScan = new Scanner(System.in);
            System.out.println("Guess higher: ");
            processGuess(guessScan.nextInt(), rand);
        }
        if(guess > rand) {
            Scanner guessScan = new Scanner(System.in);
            System.out.println("Guess lower: ");
            processGuess(guessScan.nextInt(), rand);
        } else {
            System.out.println("You guessed it. Nice!");
        }

    }
}
