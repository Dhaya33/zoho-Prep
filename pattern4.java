public class pattern4 {

    public static void main(String[] args) {
        Findpattern4(5);
    }
    static void Findpattern4(int num){
        for (int row = 1; row <=2*num-1 ; row++) {

            int noOfSpaces=num-row;
            for (int i = 0; i <noOfSpaces ; i++) {
                System.out.print("  ");

            }
            for (int col = row; col >=1 ; col--) {

                System.out.print( col+" " );

            }

            for (int col =2 ; col <=row ; col++) {

                System.out.print(col+" ");
                int noOfSpaces1=row-num;
                if(row>=num) {
                    for (int i = row; i <= noOfSpaces1; i++) {
                        System.out.print(" ");

                    }
                }
            }

            System.out.println();

        }
    }
}
