import java.util.Random;
import java.util.Scanner;

// Driver class - contains the main method
// The main method is the entry point to the program

public class App {
    static String greeting = "heyyyyy";

    // public - accessed by any other class not just the App class
    // static - you don't need to instantiate an object of the App class
    // void - does not return any outputs
    // main - method name
    // String[] args - arguments we're passing through the main method
    // String[] - string array datatype
    public static void main(String[] args) throws Exception {
        // methods in java follow a general structure:
        // access_modifier modifier return_type method_name(method_parameter_data_type
        // method_parameter_name)

        System.out.println("Hello World!");

        System.out.println(Hello("Hi"));
        String[] moves = new String[] { "rock", "paper", "scissors" };
        // Scanner class for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a move: [0] rock\t [1] paper\t [2] scissors");
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "0":
                userInput = moves[0];
                break;
            case "1":
                userInput = moves[1];
                break;
            case "2":
                userInput = moves[2];
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        scanner.close();
        Random random = new Random();
        String computerMove = moves[random.nextInt(3)];
        System.out.println("Computer plays: " + computerMove);
        // if equal, it's a tie
        if (computerMove.equals(userInput))
            System.out.println("It's a tie!");
        else {
            if ((userInput.equals("scissors") && computerMove.equals(("paper")))
                    || (userInput.equals("paper") && computerMove.equals(("rock")))
                    || (userInput.equals("rock") && computerMove.equals(("scissors"))))
                System.out.println("User wins");
            else
                System.out.println("Computer wins!");
        }
        // if (userInput.equals("scissors")) {
        // if (computerMove.equals("scissors")) {
        // System.out.println("It's a tie!");
        // } else if (computerMove.equals("paper")) {
        // System.out.println("User wins");
        // } else {
        // System.out.println("Computer wins");
        // }
        // } else if (userInput.equals("paper")) {
        // if (computerMove.equals("scissors")) {
        // System.out.println("Computer wins");
        // } else if (computerMove.equals("paper")) {
        // System.out.println("It's a tie!");
        // } else {
        // System.out.println("User wins");
        // }
        // } else {
        // if (computerMove.equals("scissors")) {
        // System.out.println("User wins");
        // } else if (computerMove.equals("paper")) {
        // System.out.println("Computer wins");
        // } else {
        // System.out.println("It's a tie!");
        // }
        // }

        // error - A
        // Hello World! - B
        // hello - C
        // Hello World! hello - D
    }

    // fun fact! Method params are variables that are scoped to the method
    static String Hello(String greeting) {
        return greeting;
    }
}
