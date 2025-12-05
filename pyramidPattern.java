public class pyramidPattern {
    public static void main(String[] args) {
        pyramid(5);

    }

    static void pyramid(int n){

        for (int row = 1; row <=n ; row++) {

            int spaces=n-row;

            for (int i = 1; i <=spaces ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=n-spaces ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
