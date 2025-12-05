public class hollowTriangle {
    public static void main(String[] args) {
        hollowTrianglePattern(5);

    }
    private static void hollowTrianglePattern(int n){

        for (int row = 1; row <=5 ; row++) {

            for (int i = 1; i <=n-row ; i++) {
                System.out.print(" ");

            }

            for (int col = 1; col <=2*row-1 ; col++) {
                if(row==n || col==1 || col==2*row-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }



            }
            System.out.println();


        }
    }
}
