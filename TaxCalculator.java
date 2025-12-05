import java.util.Scanner;

public class TaxCalculator {

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            return 0;
        }
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        }
        else if (income <= 1000000) {
            // 5% for first 2.5L to 5L
            tax = 250000 * 0.05;
            // 20% for remaining
            tax += (income - 500000) * 0.20;
        }
        else {
            // 5% slab
            tax = 250000 * 0.05;
            // 20% slab
            tax += 500000 * 0.20;
            // 30% slab for above 10L
            tax += (income - 1000000) * 0.30;
        }

        return tax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Annual Income: ");
        double income = sc.nextDouble();

        double taxAmount = calculateTax(income);
        double netIncome = income - taxAmount;

        System.out.println("Gross Income : " + income);
        System.out.println("Tax Amount   : " + taxAmount);
        System.out.println("Net Income   : " + netIncome);
    }
}