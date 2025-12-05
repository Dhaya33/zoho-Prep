public class diamondPattern {
    public static void main(String[] args) {
        DiamondPattern(5);

    }
    private static void DiamondPattern(int n){

        for (int row = 1; row <=n ; row++) {

            for (int i = 1; i <=n-row; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int row = 1; row <n; row++) {
            for (int i = 1; i <=row ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("* ");


            }
            System.out.println();



        }
    }
}
