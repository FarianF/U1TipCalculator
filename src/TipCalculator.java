import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of people
        System.out.print("Enter the number of people in the party: ");
        int numberOfPeople = scanner.nextInt();

        // Prompt for the total bill amount
        System.out.print("Enter the total bill amount before tip: $");
        double totalBill = scanner.nextDouble();

        // Prompt for the tip percentage
        System.out.print("Enter the tip percentage (in whole numbers, e.g., 15 for 15%): ");
        int tipPercentage = scanner.nextInt();

        // Calculate total tip amount
        double totalTipAmount = (totalBill * tipPercentage) / 100.0;

        // Calculate total bill including tip
        double totalWithTip = totalBill + totalTipAmount;

        // Calculate tip amount per person
        double tipPerPerson = totalTipAmount / numberOfPeople;

        // Calculate total per person
        double totalPerPerson = totalWithTip / numberOfPeople;

        // Display the results with proper formatting
        System.out.println("\nTip Calculator Results:");
        System.out.printf("Total bill: $%.2f%n", totalBill);
        System.out.printf("Tip percentage: %d%%%n", tipPercentage);
        System.out.printf("Number of people: %d%n", numberOfPeople);
        System.out.printf("Total per person: $%.2f%n", totalPerPerson);
        System.out.printf("Total tip per person: $%.2f%n", tipPerPerson);

        scanner.close();
    }
}
