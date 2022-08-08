package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private String scanner;
    public static void main(String[] args) {

    }
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something: ");
        return ("You typed: " + scanner.nextLine());
    }
    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something truthy: ");
        String userInput = scanner.nextLine();
        return Objects.equals(userInput, "true") ||
                Objects.equals(userInput, "yes") ||
                Objects.equals(userInput, "y") ||
                Objects.equals(userInput, "Y");
    }
    public static int getInt(int min, int max) {
        int userInput = min - 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter an integer between %s and %s: ", min, max);
            userInput = scanner.nextInt();
        } while (userInput <= min || userInput >= max);
        return userInput;
    }

    public static int getInt() {
        int userInput = 0;
        while (userInput <= 1 || userInput >= 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer between 1 and 5: ");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public static double getDouble(double min, double max) {
        double userInput = min - 1;
        while (userInput <= min || userInput >= max) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a number between %s and %s: ", min, max);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }
    public static double getDouble() {
        double userInput = 0;
        while (userInput <= 1 || userInput >= 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 5: ");
            userInput = scanner.nextDouble();
        }
        return userInput;
    }
}
