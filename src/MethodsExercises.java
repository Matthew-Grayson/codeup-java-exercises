import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(10, 6));
        System.out.println(subtract(10, 6));
        System.out.println(multiply(10, 6));
        System.out.println(divide(10, 6));
        System.out.println(findRemainder(10, 6));
        Scanner intScan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10, intScan.nextInt());
        System.out.println(userInput);
        long factorial = getFactorial(userInput);
        System.out.printf("%s! = %s%n", userInput, factorial);
        Scanner diceType = new Scanner(System.in);
        System.out.print("Enter number of sides for dice: ");
        rollDice(diceType.nextInt());
    }

    public static int getInteger(int min, int max, int input) {
        if (input >= min && input <= max) {
            return input;
        } else {
            Scanner intScan = new Scanner(System.in);
            System.out.print("Try again. Enter a number between 1 and 10: ");
            return getInteger(min, max, intScan.nextInt());
        }
    }

    public static void rollDice(int sides) {
        System.out.println("Your dice rolls:");
        System.out.format("%.0f%n", Math.floor(Math.random() * sides) + 1);
        System.out.format("%.0f%n", Math.floor(Math.random() * sides) + 1);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int findRemainder(int num1, int num2) {
        return num1 % num2;
    }

    public static int getFactorial(int num) {
        if (num >= 1)
            return num * getFactorial(num - 1);
        else
            return 1;
    }
}
