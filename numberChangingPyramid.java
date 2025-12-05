public class numberChangingPyramid {
    public static void main(String[] args) {
        numberChangingPyramidPattern(5);
    }
    static void numberChangingPyramidPattern(int n){

        int num=1;
        for (int row = 1; row <=5; row++) {

            for (int col = 1; col <=row ; col++) {
                System.out.print(num + " ");
                num++;

            }

            System.out.println();

        }
    }


}
