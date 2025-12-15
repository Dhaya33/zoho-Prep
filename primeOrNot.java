public class primeOrNot {
    public static void main(String[] args) {
        checkPrime(12);

    }

    static void checkPrime(int num){

        boolean isPrime = true;

        if(num<=2){
            System.out.println("prime");
        }else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;

                    break;
                }
            }

        }System.out.println(isPrime);
    }
}
