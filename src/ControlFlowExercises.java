import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner powers = new Scanner(System.in);
        System.out.print("Continue? [y/n] ");
        String userChoice = powers.next();
        if(Objects.equals(userChoice, "y")) {
            System.out.print("What number would you like to go up to? ");
            int userInput = powers.nextInt();
            for(int i = 1; i <= userInput; i++) {
                System.out.print(i + "^2 = ");
                System.out.format("%.0f; ", Math.pow(i,2));
                System.out.print(i + "^3 = ");
                System.out.format("%.0f%n", Math.pow(i,3));
            }
        }
    }
}
