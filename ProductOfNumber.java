import java.util.Scanner;

class ProductOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        int product = 1;

        while (i <= n) {
            product = product * i;
            i++;
        }

        System.out.println("Product = " + product);
    }
}