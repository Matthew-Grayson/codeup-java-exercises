import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.print("The value of pi is approximately ");
        System.out.format("%.2f%n", pi);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput1 = scanner1.next();
        System.out.println("You entered: --> \"" + userInput1 + "\" <--");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput2 = scanner2.nextInt();
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String userInput3a = scanner3.next();
        String userInput3b = scanner3.next();
        String userInput3c = scanner3.next();
        System.out.print(userInput3a + "\n" + userInput3b + "\n" + userInput3c + "\n");

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter a sentence.: ");
        String userInput4 = scanner4.nextLine();
        System.out.println("You entered: --> \"" + userInput4 + "\" <--");

        Scanner rectDimensions = new Scanner(System.in);
        System.out.print("Enter the unit of measurement: ");
        String unit = rectDimensions.nextLine();
        System.out.print("Enter the length as an integer: ");
        String length = rectDimensions.nextLine();
        int pLength = parseInt(length);
        System.out.print("Enter the width as an integer: ");
        String width = rectDimensions.nextLine();
        int pWidth = parseInt(width);
        System.out.printf("The perimeter of the room is " + (pLength * 2 + pWidth * 2) + " " + unit + ".%n The area of the room is " + (pLength * pWidth) + " square " + unit + ".");
    }
}
