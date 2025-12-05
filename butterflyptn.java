public class butterflyptn {
    public static void main(String[] args) {
        butterflyPattern(5);

    }
    private static void butterflyPattern(int n){

        for (int row = 1; row <=n; row++) {


            for (int col = 1; col <=row ; col++) {
                System.out.print("*");

            }
            for (int i = 1; i <=2*(n-row) ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");

            }System.out.println();
        }
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("*");

            }
            for (int i = 1; i <=(2*row)-2 ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}
