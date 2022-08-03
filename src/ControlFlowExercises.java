import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        System.out.print("Continue? [y/n] ");
        String userChoice = grades.next();
        if(Objects.equals(userChoice, "y")) {
            System.out.print("Enter your grade out of 100: ");
            int userInput = grades.nextInt();
            if (userInput <= 59) {
                System.out.println("Your grade is an F.");
            } else if (userInput <= 61) {
                System.out.println("Your grade is a D-.");
            } else if (userInput <= 64) {
                System.out.println("Your grade is a D.");
            } else if (userInput <= 66) {
                System.out.println("Your grade is a D+.");
            } else if (userInput <= 68) {
                System.out.println("Your grade is a C-.");
            } else if (userInput <= 77) {
                System.out.println("Your grade is a C.");
            } else if (userInput <= 79) {
                System.out.println("Your grade is a C+.");
            } else if (userInput <= 81) {
                System.out.println("Your grade is a B-.");
            } else if (userInput <= 85) {
                System.out.println("Your grade is a B.");
            } else if (userInput <= 87) {
                System.out.println("Your grade is a B+.");
            } else if (userInput <= 89) {
                System.out.println("Your grade is an A-.");
            } else if (userInput <= 98) {
                System.out.println("Your grade is an A.");
            } else {
                System.out.println("Your grade is an A+.");
            }
        }
    }
}
