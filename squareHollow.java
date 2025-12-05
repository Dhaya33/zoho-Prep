public class squareHollow {
    public static void main(String[] args) {
        squareHollowPattern(5);

    }
    private static void squareHollowPattern(int n){
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n; col++) {
                if(row==0 || col==0 || row==n || col==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }


            }
            System.out.println();

        }
    }
}
