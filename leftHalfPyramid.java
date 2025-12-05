public class leftHalfPyramid {
    public static void main(String[] args) {
        leftHalfPyramidPattern(5);


    }
    static void leftHalfPyramidPattern(int n){
        for (int row = 1; row <=n; row++) {

            int spaces= n-row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");

            }
            for (int col = 1;  col<=row; col++) {
                System.out.print("*");

            }System.out.println();

        }
    }
}
