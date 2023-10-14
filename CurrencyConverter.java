import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded exchange rate for demonstration purposes
        double exchangeRate = 0.85; // Example: 1 USD = 0.85 EUR

        System.out.println("Currency Converter");
        System.out.println("Available currencies: USD, EUR, GBP");

        // Input for base currency
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        // Input for target currency
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Input for amount
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Conversion logic
        double convertedAmount;
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            convertedAmount = amount * exchangeRate;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            convertedAmount = amount / exchangeRate;
        } else {
            System.out.println("Unsupported currency conversion.");
            return;
        }

        // Displaying the result
        System.out.printf("Converted amount: %.2f %s", convertedAmount, targetCurrency);
    }
}
