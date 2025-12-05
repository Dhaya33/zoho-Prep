import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        // Count digits
        int digits = String.valueOf(num).length();

        while (temp != 0) {
            int r = temp % 10;           // extract last digit
            sum += Math.pow(r, digits);  // r^digits
            temp /= 10;                  // remove last digit
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}