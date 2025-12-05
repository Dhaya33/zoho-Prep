public class kPattern {
    public static void main(String[] args) {
        patternK(5);

    }
    private static void patternK(int n){

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=n-row+1; col++) {

                System.out.print("* ");

            }

            System.out.println();


        }
        for (int row= 1; row <=n ; row++) {

            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }

            System.out.println();


        }
    }
}
