public class hollowHourglass {
    public static void main(String[] args) {
        hollowHourglassPattern(5);

    }
    private static void hollowHourglassPattern(int n){

        for (int row = 1; row <=5 ; row++) {
            for (int i = 1; i <=row-1 ; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n-row+1 ; col++) {
                if(row==1 || col==1 || col==n-row+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }


            }

            System.out.println();



        }for (int row = 1; row <n ; row++) {

            for (int i = 1; i <=n-row-1 ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=row +1 ; col++) {
                if(row==n-1 || col==1 || col==row+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println();



        }
    }
}
