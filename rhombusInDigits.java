public class rhombusInDigits {
    public static void main(String[] args) {
        RhombusInDigits(5);


    }
    static void RhombusInDigits(int n){



        for (int row = 1; row <=2*n-1; row++) {

            int spaces= row > n ? row-n : n-row;  // (a>b) ? a ; b ;
            for (int i = 0; i <= spaces; i++) {
                System.out.print(" ");

            }

            for (int col = row; col >=1 ; col--) {

                System.out.print(col+" ");

            }
            for (int col = 2; col <=spaces-row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();

        }





        }
    }


