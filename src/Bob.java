import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobScan = new Scanner(System.in);
        System.out.print("Write a message to Bob:");
        String userInput = bobScan.nextLine();
        if(userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if(userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
