import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;  // 0, 1, negative numbers are not prime
        }

        while (i * i <= num) { // check until sqrt(num)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
    }
}