package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public void main(String[] args) {

    }
    public String getString() {
        System.out.print("Type something: ");
        return ("You typed: " + scanner.nextLine());
    }
    public boolean yesNo() {
        System.out.print("Would you like to continue? ");
        String userInput = scanner.nextLine();
        return Objects.equals(userInput, "true") ||
                Objects.equals(userInput, "yes") ||
                Objects.equals(userInput, "y") ||
                Objects.equals(userInput, "Y");
    }
    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Enter an integer between %s and %s: ", min, max);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public int getInt() {
        int userInput;
        do  {
            System.out.println("Enter an integer between 1 and 100: ");
            userInput = scanner.nextInt();
        } while(userInput < 1 || userInput > 100);
        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            userInput = scanner.nextDouble();
        } while(userInput < min || userInput > max);
        return userInput;
    }
    public double getDouble() {
        double userInput;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            userInput = scanner.nextDouble();
        } while(userInput < 1 || userInput > 100);
        return userInput;
    }
}
