public class diamondNumber {
    public static void main(String[] args) {
        diamondNumberPattern(5);
    }
    private static void diamondNumberPattern(int n){

        for (int row = 1; row <=n; row++) {
            for (int i = 0; i <=row-1 ; i++) {
                System.out.print(" ");

            }
            for (int col = row; col <=n ; col++) {

                System.out.print(col+" ");

            }
            System.out.println();

        }
        for (int row = 1; row <n ; row++) {

            for (int i = 1; i <=n-row  ; i++) {
                System.out.print(" ");

            }
            for (int col = n-row; col <=n ;col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }

    }
}
