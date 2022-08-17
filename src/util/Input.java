package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public String getString() {
        System.out.print("Type something: ");
        return ("You typed: " + scanner.nextLine());
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return ("You typed: " + scanner.nextLine());
    }
    public String getString(String prompt, String var) {
        System.out.format(prompt, var);
        return (scanner.nextLine());
    }
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return Objects.equals(userInput, "true") ||
                Objects.equals(userInput, "yes") ||
                Objects.equals(userInput, "y") ||
                Objects.equals(userInput, "Y");
    }
    public int getInt(int min, int max, String prompt) {
        int userInput;
        do {
            System.out.print(prompt);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }
    public int getInt(String prompt) {
//        System.out.print(prompt);
        //set input to var first
        try {
            return Integer.valueOf(getString(prompt));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public int getInt() {
        int userInput;
        do  {
            System.out.println("Enter an integer between 1 and 100: ");
            userInput = scanner.nextInt();
        } while(userInput < 1 || userInput > 100);
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        double userInput;
        do {
            System.out.print(prompt);
            userInput = scanner.nextDouble();
            scanner.nextLine();
        } while(userInput < min || userInput > max);
        return userInput;
    }
    public double getDouble(String prompt) {
        double userInput;
        System.out.println(prompt);
        userInput = scanner.nextDouble();
        scanner.nextLine();
        return userInput;
    }
    public double getDouble() {
        double userInput;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            userInput = scanner.nextDouble();
            scanner.nextLine();
        } while(userInput < 1 || userInput > 100);
        return userInput;
    }
}
