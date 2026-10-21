
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // values
        int numLoaves;
        int time;
        LocalDateTime startTime = null;
        LocalDateTime endTime = null;
        int starterFed;
        int needsFeedingHelp;
        int outsideTemp;
        int outsideHumidity;
        int insideTemp;
        int insideHumidity;

        System.out.println("Welcome to my sourdough app!");
        System.out.print("\n");
        System.out.print("Let's have fun with some sourdough!\nHow many loaves are you looking to make: ");
        numLoaves = scanner.nextInt();
        System.out.println("You entered: " + numLoaves);
        System.out.println("Do you want to provide a start time or end time for your sourdough? (Enter 1 for 'start' or 2 for 'end'): ");
        time = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        // Logic to handle start time or end time
        if (time == 1) {
            System.out.println("You chose to provide a start time.");
            System.out.print("Enter your starting date and time (MM/dd/yyyy HH:mm): ");
            String input = scanner.nextLine();

            startTime = LocalDateTime.parse(input, formatter);
            System.out.println("Your starting time is: " + startTime.format(formatter));

        } else if (time == 2) {
            System.out.println("You chose to provide an end time.");
            System.out.print("Enter your desired finishing date and time (MM/dd/yyyy HH:mm): ");
            String input = scanner.nextLine();

            endTime = LocalDateTime.parse(input, formatter);
            System.out.println("Your desired finishing time is: " + endTime.format(formatter));

        } else {
            System.out.println("Invalid input. Please enter 1 for 'start' or 2 for 'end'.");
        }

        System.out.println("Is your starter fed and ready to use? (Enter 1 for 'yes' or 2 for 'no'): ");
        starterFed = scanner.nextInt();
        System.out.println("You entered: " + starterFed);

        // Additional logic for starter fed can be added here
        if (starterFed == 1) {
            System.out.println("Great! Your starter is ready to use.");
        } else if (starterFed == 2) {
            System.out.println("No worries! Do you need help with feeding your starter? (Enter 1 for 'yes' or 2 for 'no'): ");
            needsFeedingHelp = scanner.nextInt();
            System.out.println("You entered: " + needsFeedingHelp);

            if (needsFeedingHelp == 1) {
                System.out.println("Here are some feeding ratios for your starter...");
                // Additional logic for feeding ratios can be added here
            } else if (needsFeedingHelp == 2) {
                System.out.println("Okay! Come back when your starter is fed and ready to use!");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid input. Please enter 1 for 'yes' or 2 for 'no'.");
            }
        } else {
            System.out.println("Invalid input. Please enter 1 for 'yes' or 2 for 'no'.");
        }

        scanner.close();
    }
}
